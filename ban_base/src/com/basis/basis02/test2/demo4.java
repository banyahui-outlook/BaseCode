package com.test2;

import com.bean2.threadcla;

/**
 * @Creater banyahui
 * @Date 2019/11/24 上午 11:25
 * @Description 线程 继承方式
 */
public class demo4 {
    public static void main(String[] args) {
        threadcla cla = new threadcla();
        cla.start();
        System.out.println(Thread.currentThread().getName() + "---do...");

    }
}
