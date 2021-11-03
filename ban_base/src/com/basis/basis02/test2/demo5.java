package com.test2;

import com.bean2.threadimp;

/**
 * @Creater banyahui
 * @Date 2019/11/24 上午 11:33
 * @Description 线程 实现接口
 */
public class demo5 {
    public static void main(String[] args) {
        threadimp imp=new threadimp();

        Thread thread=new Thread(imp,"name...");
        thread.start();

        int x=100;
        while (x>0)
        {
            System.out.println("x = " + x);
            x--;
        }
    }
}
