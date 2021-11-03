package com.bean2;

/**
 * @Creater banyahui
 * @Date 2019/11/24 下午 12:14
 * @Description
 */
public class ticket implements Runnable {
    private int allcount = 100;

    @Override
    public void run() {
        while (allcount > 0) {
            System.out.println(Thread.currentThread().getName() + "--当前消耗：" + allcount);
            allcount--;
        }
    }
}
