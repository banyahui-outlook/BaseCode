package com.ban.model;

import lombok.Data;
import lombok.Setter;

@Setter
public class User02 {
    private String name;
    private Integer age;

    public String getName() {
        return this.name;
    }
}
