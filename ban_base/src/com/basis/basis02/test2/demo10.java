package com.test2;

import com.bean2.funcinter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @Creater banyahui
 * @Date 2019/11/24 下午 14:14
 * @Description lambda
 */
public class demo10 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable run...");
            }
        }).start();

        new Thread(() -> {
            System.out.println("jian tou xiancheng...");
            show();
        }).start();

        List<Integer> lists = new ArrayList<>();
        lists.add(12);
        lists.add(44);
        lists.add(8);
        lists.add(89);

         Comparator aa= new Comparator() {
             @Override
             public int compare(Object o1, Object o2) {
                 return 0;
             }

             @Override
             public Comparator thenComparing(Comparator other) {
                 return null;
             }
         };

        lists.sort((o1, o2) -> {
            return o1 - o2;
        });
        System.out.println("lists = " + lists);


        new funcinter() {
            @Override
            public void comp() {

            }

            @Override
            public void comp2(Integer x) {

            }
        };

    }

    private  static  void  show(){
        System.out.println("function...");
    }
}
