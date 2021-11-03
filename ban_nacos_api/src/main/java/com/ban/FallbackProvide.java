package com.ban;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class FallbackProvide implements FallbackFactory<ProvideService> {

    @Override
    public ProvideService create(Throwable throwable) {
        return new ProvideService() {
            @Override
            public String hello() {
                return "factory fall back...";
            }
        };
    }
}
