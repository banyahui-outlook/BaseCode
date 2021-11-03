package com.dao;

/**
 * @Creater banyahui
 * @Date 2019/11/25 下午 21:25
 * @Description
 */
public class People {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public People(String name) {
        this.name = name;
    }
}
