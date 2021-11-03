package com.bean2;

/**
 * @Creater banyahui
 * @Date 2019/11/24 下午 12:00
 * @Description
 */
public class threadimp implements Runnable {
    @Override
    public void run() {
        int i = 100;
        while (i > 0) {
            System.out.println("i = " + i);
            i--;
        }
    }
}
