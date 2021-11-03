package com.bean2;

/**
 * @Creater banyahui
 * @Date 2019/11/24 上午 11:26
 * @Description
 */
public class threadcla extends Thread {
    public void run() {
        int i = 10;
        while (i > 0) {
            System.out.println(Thread.currentThread().getName() + "--" + i);
            i--;
        }
    }
}
