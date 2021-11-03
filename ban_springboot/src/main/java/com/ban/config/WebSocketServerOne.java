package com.ban.config;

import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

@ServerEndpoint("/ws/serverOne")
@Component
public class WebSocketServerOne {
    //concurrent包下线程安全的Set
    private static final CopyOnWriteArraySet<WebSocketServerOne> SESSIONS = new CopyOnWriteArraySet<>();
    private Session session;

    @OnOpen
    public void onOpen(Session session) {
        this.session = session;
        SESSIONS.add(this);
        System.out.println(String.format("成功建立连接~ 当前总连接数为:%s", SESSIONS.size()));
        System.out.println(this);
    }

    @OnClose
    public void onClose() {
        SESSIONS.remove(this);
        System.out.println(String.format("成功关闭连接~ 当前总连接数为:%s", SESSIONS.size()));
    }

    @OnMessage
    public void onMessage(String message, Session session) {
        System.out.println(message);
    }

    @OnError
    public void onError(Session session, Throwable error) {
        System.out.println("发生错误");
        error.printStackTrace();
    }

    /**
     * 指定发消息
     *
     * @param message
     */
    public void sendMessage(String message) {
        try {
            this.session.getBasicRemote().sendText(message);
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
        SESSIONS.forEach(ws -> ws.sendMessage(message));
    }
}
