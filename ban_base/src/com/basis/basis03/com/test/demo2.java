package com.test;

import com.dao.People;

import java.lang.reflect.InvocationTargetException;

/**
 * @Creater banyahui
 * @Date 2019/11/25 下午 21:25
 * @Description 反射 取指定构造函数生成对象
 */
public class demo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class aClass = Class.forName("com.dao.People");
        Object o = aClass.getDeclaredConstructor(new Class[]{String.class }).newInstance(new Object[]{"张三" });
        People p=(People) o;
        System.out.println("p.getName() = " + p.getName());
    }
}
