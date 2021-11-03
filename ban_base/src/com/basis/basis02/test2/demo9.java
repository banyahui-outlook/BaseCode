package com.test2;

import java.util.concurrent.*;

/**
 * @Creater banyahui
 * @Date 2019/11/24 下午 14:06
 * @Description Call线程
 */
public class demo9 {
    public static void main(String[] args) {
        Callable<Integer> call = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int all = 10;
                int i = 99999;
                while (i > 0) {
                    all += i;
                    i--;
                }
                Thread.sleep(3000);
                return all;
            }
        };

        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<Integer> submit = service.submit(call);
        boolean b = true;
        do {
            if (submit.isDone() == false) {
                System.out.println("isdone false...");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                continue;
            }
            b = false;
            System.out.println("isdone："+submit.isDone());
            try {
                System.out.println("submit = " + submit.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        } while (b);

        System.out.println("----------------------------");

        service.shutdown();
        try {
            if (!service.awaitTermination(800, TimeUnit.MILLISECONDS)) {
                service.shutdownNow();
            }
        } catch (InterruptedException e) {
            service.shutdownNow();
        }
    }
}
