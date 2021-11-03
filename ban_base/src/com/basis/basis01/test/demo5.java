package com.test;

/**
 * @Creater banyahui
 * @Date 2019/11/20 下午 14:30
 * @Description 函数/方法
 */
public class demo5 {
    public static void main(String[] args) {
        show();
        show(989);

        int x = add(10, 9);
        System.out.println("x = " + x);

        int mat = mat(2, 4, 5);
        System.out.println("mat = " + mat);
    }

    public static void show() {
        System.out.println("show method...");
    }

    public static void show(int i) {
        System.out.println("i = " + i);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int mat(int... param) {
        int result = 1;
        for (int i : param) {
            result *= i;
        }
        return result;
    }
}

