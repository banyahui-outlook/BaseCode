package com.test;

import com.dao.People;
import com.dao.Student;

/**
 * @Creater banyahui
 * @Date 2019/11/20 下午 16:19
 * @Description 基类object object重写equals toString
 */
public class demo1 {
    public static void main(String[] args) {
        Object obj=new Object();
        System.out.println(obj);

        People p=new Student("aaa",11);
        System.out.println("p = " + p);

        People p2=new Student("aaa",11);
        System.out.println("p2 = " + p2);

        System.out.println(p.equals(p2));

        People p3=p;
        System.out.println(p2.equals(p3));
        System.out.println(p2==p3);
    }
}
