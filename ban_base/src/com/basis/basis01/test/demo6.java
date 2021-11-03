package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Creater banyahui
 * @Date 2019/11/20 下午 14:33
 * @Description 流程控制
 */
public class demo6 {
    public static void main(String[] args) {
        ifelse();
        switc();
        whil();
        foris();
        iters();
    }

    public static void ifelse() {
        int i1 = 1;
        if (i1 % 2 == 0) {
            System.out.println("i1 is 2 zc");
        } else {
            System.out.println("i1 not 2 zc");
        }
    }

    public static void switc() {
        int i1 = 1;
        switch (i1) {
            case 1:
                System.out.println("this is 1");
                break;
            default:
                System.out.println("this not 1");
                break;
        }
    }

    public static void whil() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(123);
        list.add(345);

        int count = 0;
        while (count < list.size()) {
            System.out.println(list.get(count));
            count++;
        }
    }

    public static void foris() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(123);
        list.add(345);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void iters() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(123);
        list.add(345);

        for (Integer integer : list) {
            System.out.println("integer = " + integer);
            break;
        }
    }
}
