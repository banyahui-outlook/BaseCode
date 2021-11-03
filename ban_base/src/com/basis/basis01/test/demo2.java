package com.test;

/**
 * @Creater banyahui
 * @Date 2019/11/19 下午 14:03
 * @Description 数据类型4类8种
 */
public class demo2 {
    public static void main(String[] args) {
        byte b1 = -128;
        System.out.println("b1 = " + b1);
        byte b2 = 127;
        System.out.println("b2 = " + b2);
        Byte aaa = Byte.decode("0x18");
        System.out.println("aaa = " + aaa);

        short s1=32767;
        System.out.println("s1 = " + s1);
        short s2 = -32768;
        System.out.println("s2 = " + s2);

        int i1=Integer.MAX_VALUE;
        System.out.println("i1 = " + i1);
        int i2=Integer.MIN_VALUE;
        System.out.println("i2 = " + i2);
        int i = Integer.parseInt("11", 16);
        System.out.println("i = " + i);
        String s = Integer.toString(11, 16);
        System.out.println("s = " + s);


        long l1=Long.MAX_VALUE;
        System.out.println("l1 = " + l1);
        long l2=Long.MIN_VALUE;
        System.out.println("l2 = " + l2);
        int i3 = Long.bitCount(100);
        System.out.println("i3 = " + i3);


        float f1=Float.MAX_VALUE;
        System.out.println("f1 = " + f1);
        float f2=Float.MIN_VALUE;
        System.out.println("f2 = " + f2);

        double d1=Double.MAX_VALUE;
        System.out.println("d1 = " + d1);
        double d2=Double.MIN_VALUE;
        System.out.println("d2 = " + d2);


        boolean bl1=true;
        System.out.println("bl1 = " + bl1);
        boolean bl2=false;
        System.out.println("bl2 = " + bl2);


        char c1='A';
        System.out.println("c1 = " + c1);
        char c2='8';
        System.out.println("c2 = " + c2);

        String sr1="hello";
        System.out.println("sr1 = " + sr1);
        String sr2="大神";
        System.out.println("sr2 = " + sr2);
    }
}
