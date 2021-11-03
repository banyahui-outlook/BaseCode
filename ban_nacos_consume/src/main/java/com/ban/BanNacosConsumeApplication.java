package com.ban;

import com.ban.rule.NacosWeightLoadBalancerRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class BanNacosConsumeApplication {

//    @Bean
//    public IRule getLoadBalancerRule(){
//        return new NacosWeightLoadBalancerRule();
//    }

    @Bean
    @LoadBalanced
    public RestTemplate getTem(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(BanNacosConsumeApplication.class, args);
    }

}
