package com.ban.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ThreeComs {
//    @Bean
//    public ServletRegistrationBean servletRegistrationBean() {
//        return new ServletRegistrationBean(new Servlet() {
//            @Override
//            public void init(ServletConfig servletConfig) throws ServletException {
//                System.out.println("init................");
//            }
//
//            @Override
//            public ServletConfig getServletConfig() {
//                return null;
//            }
//
//            @Override
//            public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
//
//            }
//
//            @Override
//            public String getServletInfo() {
//                return null;
//            }
//
//            @Override
//            public void destroy() {
//
//            }
//        }, "/sel");
//    }
//
//    @Bean
//    public FilterRegistrationBean filterRegistrationBean(){
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new Filter() {
//            @Override
//            public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//                System.out.println("filter.................");
//            }
//        });
//        filterRegistrationBean.addUrlPatterns("/*");
//        return filterRegistrationBean;
//    }
//
//    @Bean
//    public ServletListenerRegistrationBean servletListenerRegistrationBean() {
//        ServletListenerRegistrationBean servletListenerRegistrationBean = new ServletListenerRegistrationBean(new ServletContextListener() {
//            @Override
//            public void contextInitialized(ServletContextEvent sce) {
//                System.out.println("listerner......................");
//            }
//
//            @Override
//            public void contextDestroyed(ServletContextEvent sce) {
//
//            }
//        });
//        return servletListenerRegistrationBean;
//    }
}
