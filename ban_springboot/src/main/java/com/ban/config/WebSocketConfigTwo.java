package com.ban.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.socket.*;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.server.HandshakeInterceptor;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Configuration
public class WebSocketConfigTwo implements WebSocketConfigurer {
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
        webSocketHandlerRegistry.addHandler(new MyWebSocketHandler(), "/ws/serverTwo")//设置连接路径和处理
                .setAllowedOrigins("*")
                .addInterceptors(new MyWebSocketInterceptor());//设置拦截器
    }
}
class MyWebSocketInterceptor implements HandshakeInterceptor {
    //前置拦截一般用来注册用户信息，绑定 WebSocketSession
    @Override
    public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response,
                                   WebSocketHandler wsHandler, Map<String, Object> attributes) throws Exception {
        System.out.println("前置拦截~~");
        if (!(request instanceof ServletServerHttpRequest)) return true;
//            HttpServletRequest servletRequest = ((ServletServerHttpRequest) request).getServletRequest();
//            String userName = (String) servletRequest.getSession().getAttribute("userName");
        String userName = "Koishipyb";
        attributes.put("userName", userName);
        return true;
    }
    @Override
    public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response,
                               WebSocketHandler wsHandler, Exception exception) {
        System.out.println("后置拦截~~");
    }
}

class MyWebSocketHandler implements WebSocketHandler {
    private static final Map<String, WebSocketSession> SESSIONS = new ConcurrentHashMap<>();

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        String userName = session.getAttributes().get("userName").toString();
        SESSIONS.put(userName, session);
        System.out.println(String.format("成功建立连接~ userName: %s", userName));
    }

    @Override
    public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
        String msg = message.getPayload().toString();
        System.out.println(msg);
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        System.out.println("连接出错");
        if (session.isOpen()) {
            session.close();
        }
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) throws Exception {
        System.out.println("连接已关闭,status:" + closeStatus);
    }

    @Override
    public boolean supportsPartialMessages() {
        return false;
    }

    /**
     * 指定发消息
     *
     * @param message
     */
    public static void sendMessage(String userName, String message) {
        WebSocketSession webSocketSession = SESSIONS.get(userName);
        if (webSocketSession == null || !webSocketSession.isOpen()) return;
        try {
            webSocketSession.sendMessage(new TextMessage(message));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 群发消息
     *
     * @param message
     */
    public static void fanoutMessage(String message) {
        SESSIONS.keySet().forEach(us -> sendMessage(us, message));
    }
}