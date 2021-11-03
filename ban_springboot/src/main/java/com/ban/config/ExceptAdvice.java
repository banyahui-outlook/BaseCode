package com.ban.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptAdvice {

    @ExceptionHandler(value = Exception.class)
    public String mathError(){
        return "500";
    }

}
