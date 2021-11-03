package com.ban.config;

import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import java.util.function.Predicate;

@Component
public class CusRoutePredicateFactory extends AbstractRoutePredicateFactory<CusRoutePredicateFactory.Config> {

    public CusRoutePredicateFactory() {
        super(Config.class);
    }

    @Override
    public Predicate<ServerWebExchange> apply(Config config) {
        return (param) -> {
            System.out.println("is predicate..............................");
            return true;
        };
    }


    public static class Config {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
