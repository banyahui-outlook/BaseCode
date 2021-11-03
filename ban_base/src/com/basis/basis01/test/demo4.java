package com.test;

/**
 * @Creater banyahui
 * @Date 2019/11/20 下午 14:26
 * @Description 运算符
 */
public class demo4 {
    public static void main(String[] args) {
        int i1=0;
        int i2=i1+6;
        System.out.println("i2 = " + i2);

        i2++;
        System.out.println("i2 = " + i2);

        i2--;
        System.out.println("i2 = " + i2);

        int i8=0;
        i8+=i1;
        System.out.println("i8 = " + i8);

        boolean b1=i1>i2;
        System.out.println("b1 = " + b1);

        boolean b = i1 == i2;
        System.out.println("b = " + b);

        boolean b2 = i1 != i2;
        System.out.println("b2 = " + b2);

        int i3=i1>i2?100:99;
        System.out.println("i3 = " + i3);
    }
}
