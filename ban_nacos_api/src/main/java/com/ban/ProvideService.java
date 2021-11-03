package com.ban;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "ban-nacos-provide10010",fallbackFactory = FallbackProvide.class)
public interface ProvideService {
    @GetMapping("/hello")
    String hello();
}
