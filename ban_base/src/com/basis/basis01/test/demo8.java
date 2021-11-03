package com.test;

import java.util.Random;

/**
 * @Creater banyahui
 * @Date 2019/11/20 下午 14:59
 * @Description Random
 */
public class demo8 {
    public static void main(String[] args) {
        Random random = new Random();
        int value = random.nextInt(2);
        System.out.println("value = " + value);

        double d1 = random.nextDouble();
        System.out.println("d1 = " + d1);
    }
}
