package com.test2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Creater banyahui
 * @Date 2019/11/24 下午 13:53
 * @Description 线程池
 */
public class demo8 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        Runnable runnable = new Runnable() {
            int count = 1000;
            Lock lock = new ReentrantLock();
            @Override
            public void run() {
                while (true) {
                    lock.lock();
                    if (count > 0) {
                        System.out.println(Thread.currentThread().getName() + "--count:" + count);
                        count--;
                    }
                    lock.unlock();
                }
            }
        };

        for (int i = 0; i < 10; i++) {
            service.submit(runnable);
        }
        System.out.println("-------------------------");
    }
}
