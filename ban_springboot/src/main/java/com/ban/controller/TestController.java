package com.ban.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Configuration
@ConfigurationProperties(prefix = "test")
public class TestController {

//    @Value("${server.port}")
//    private int serverPort;

    @Value("${test.name}")
    private String name;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @Autowired
    private Test2Controller test2Controller;

    @RequestMapping("/test")
    public String test() {
        System.out.println("this is test ...");
        test2Controller.sync();
        var res =10/0;
        // System.out.println(serverPort);
        System.out.println(name);
        return "test";
    }

    // 同类使用不生效
    @Async
    public void sync(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
