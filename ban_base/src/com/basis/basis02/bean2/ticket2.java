package com.bean2;

/**
 * @Creater banyahui
 * @Date 2019/11/24 下午 12:14
 * @Description 对象同步锁
 */
public class ticket2 implements Runnable {
    private int allcount = 100;
    private boolean canSell = true;

    /*ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while (canSell) {
            lock.lock();
            sell2();
            lock.unlock();
        }
    }*/

    /*Object lock = new Object();
    @Override
    public void run() {
        while (canSell) {
            synchronized (lock) {
                sell2();
            }
        }
    }*/


    @Override
    public void run() {
        while (canSell) {
            sell();
        }
    }

    public synchronized void sell() {
        if (allcount > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "--当前消耗：" + allcount);
            allcount--;
        } else {
            canSell = false;
        }
    }

    public void sell2() {
        if (allcount > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "--当前消耗：" + allcount);
            allcount--;
        } else {
            canSell = false;
        }
    }
}
