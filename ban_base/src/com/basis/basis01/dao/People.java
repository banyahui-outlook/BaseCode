package com.dao;

/**
 * @Creater banyahui
 * @Date 2019/11/20 下午 15:26
 * @Description people类
 */
public abstract class People {

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  abstract void eat();
}
