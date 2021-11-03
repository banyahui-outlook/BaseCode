package com.ban;

import org.springframework.context.annotation.Bean;

public class FeignConfiguration {
    @Bean
    public FallbackProvide echoFeignServiceFallbackFactory() {
        return new FallbackProvide();
    }

}
