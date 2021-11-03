package com.dao;

/**
 * @Creater banyahui
 * @Date 2019/11/20 下午 16:02
 * @Description
 */
public class Teacher extends People {
    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("teacher eat...");
    }

    public void teach() {
        System.out.println("teacher teach...");
    }
}
