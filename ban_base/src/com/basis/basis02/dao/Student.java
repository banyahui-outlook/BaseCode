package com.dao;

import java.io.Serializable;

/**
 * @Creater banyahui
 * @Date 2019/11/20 下午 15:43
 * @Description
 */
public class Student extends People implements Serializable {
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("student eat...");
    }

    public void  study(){
        System.out.println("student study...");
    }
}
