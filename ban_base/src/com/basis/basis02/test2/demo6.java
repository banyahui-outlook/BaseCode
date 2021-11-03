package com.test2;

/**
 * @Creater banyahui
 * @Date 2019/11/24 下午 12:07
 * @Description 匿名内部类实现线程 实现接口方式
 */
public class demo6 {
    public static void main(String[] args) {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                int x = 100;
                while (x > 0) {
                    System.out.println("x = " + x);
                    x--;
                }
            }
        };
        new Thread(run,"t name...").start();

        int y = 100;
        while (y > 0) {
            System.out.println("y = " + y);
            y--;
        }
    }
}
