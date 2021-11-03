package com.test3;

import java.util.Properties;
import java.util.Set;

/**
 * @Creater banyahui
 * @Date 2019/11/24 下午 21:17
 * @Description Properties
 */
public class demo8 {
    public static void main(String[] args) {
        Properties p=new Properties();
        p.setProperty("one","张三");
        p.setProperty("two","Lisi");

        System.out.println("p.size() = " + p.size());
        p.setProperty("two","李四");
        System.out.println("p.size() = " + p.size());

        String one = p.getProperty("one");
        System.out.println("one = " + one);

        Set<String> strings = p.stringPropertyNames();
        for (String string : strings) {
            System.out.println("string = " + string);
            System.out.println("p.get(string) = " + p.get(string));
            System.out.println("p.getProperty(string) = " + p.getProperty(string));
        }
    }
}
