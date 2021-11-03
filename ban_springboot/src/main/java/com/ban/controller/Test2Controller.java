package com.ban.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

@Component
public class Test2Controller {
    @Async
    public void sync() {
        try {
            Thread.sleep(3000);
            System.out.println("sssssssssssss...........");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
