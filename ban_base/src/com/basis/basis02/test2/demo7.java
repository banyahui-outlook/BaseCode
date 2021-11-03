package com.test2;

import com.bean2.ticket2;

/**
 * @Creater banyahui
 * @Date 2019/11/24 下午 12:14
 * @Description 线程安全
 */
public class demo7 {
    public static void main(String[] args) {
        /*ticket ticket=new ticket();

        new Thread(ticket,"xc1").start();
        new Thread(ticket,"xc2").start();
        new Thread(ticket,"xc3").start();*/

        ticket2 ticket=new ticket2();

        new Thread(ticket,"xc1").start();
        new Thread(ticket,"xc2").start();
        new Thread(ticket,"xc3").start();
    }
}
