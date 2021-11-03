package com.test;

/**
 * @Creater banyahui
 * @Date 2019/11/19 下午 14:46
 * @Description 数据转换
 */
public class demo3 {
    public static void main(String[] args) {
        int i1=111;
        byte b1 = (byte) i1;
        System.out.println("b1 = " + b1);
        
        byte b2=28;
        int i2=b2;
        System.out.println("i2 = " + i2);

        byte bc=(byte) ( b2+1);
        System.out.println("bc = " + bc);

        byte b3=(byte)'A';
        System.out.println("b3 = " + b3);

        int i3=(int)'㍨';
        System.out.println("i3 = " + i3);
    }
}
