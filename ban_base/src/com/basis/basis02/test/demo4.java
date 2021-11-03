package com.test;

import java.util.Properties;

/**
 * @Creater banyahui
 * @Date 2019/11/23 下午 23:32
 * @Description System
 */
public class demo4 {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        System.out.println("l = " + l);

        Properties properties = System.getProperties();
        System.out.println("properties = " + properties);
    }
}
