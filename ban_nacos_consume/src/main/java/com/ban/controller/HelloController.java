package com.ban.controller;

import com.ban.ProvideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RefreshScope
@RestController
public class HelloController {
    @Value("${app.version}")
    private String version;

//    @Autowired
//    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ProvideService provideService;

    @GetMapping("/hello")
    public String hello() {

//        //使用 LoadBalanceClient 和 RestTemplate 结合的方式来访问
//        ServiceInstance serviceInstance = loadBalancerClient.choose("ban_nacos_provide10010");
//
//        //  http://192.168.0.104:18082/echo/{app}
//        String url = String.format("http://%s:%s/echo", serviceInstance.getHost(), serviceInstance.getPort());
//        System.out.println("request url:"+url);

//        var data= restTemplate.getForObject(url, String.class);

        String hello = provideService.hello();
        return "this is comsumer hello" + version + hello;

    }
}
