package com.dao;

import java.io.Serializable;

/**
 * @Creater banyahui
 * @Date 2019/11/24 下午 21:32
 * @Description
 */
public class TestClass implements Serializable {
    public TestClass(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
