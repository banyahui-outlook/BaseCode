package com.test;

import java.util.ArrayList;

/**
 * @Creater banyahui
 * @Date 2019/11/23 下午 23:57
 * @Description List接口
 */
public class demo8 {
    public static void main(String[] args) {
        ArrayList<String> lists=new ArrayList<>();
        lists.add("12xx3"); lists.add("vas");

        lists.add(0,"bbb");
        lists.remove(0);
        lists.set(1,"cvvvv");

        System.out.println("di er ge:"+lists.get(1));
        System.out.println("lists = " + lists.size());
    }
}
