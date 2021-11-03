package com.ban;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BanNacosProvideApplication {

    public static void main(String[] args) {
        SpringApplication.run(BanNacosProvideApplication.class, args);
    }

}
