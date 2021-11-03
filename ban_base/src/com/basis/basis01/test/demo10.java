package com.test;

import java.util.ArrayList;

/**
 * @Creater banyahui
 * @Date 2019/11/20 下午 15:12
 * @Description String
 */
public class demo10 {
    public static void main(String[] args) {
        String str= new String("asdasdddd");
        System.out.println("str = " + str);

        char c = str.charAt(5);
        System.out.println("c = " + c);

        String[] ass = str.split("a");
        for (String s : ass) {
            System.out.println("s = " + s);
        }

        char[] chars={'b','a','n','y','a'};
        String sss=new String(chars);
        System.out.println("sss = " + sss);

        String a = "xtmjltq".substring(1,4);
        System.out.println("a = " + a);

        String join = String.join("-", "A", "B");
        System.out.println("join = " + join);

        ArrayList<String> lists=new ArrayList<>();
        lists.add("i");lists.add("love");
        lists.add("you");
        String join1 = String.join("&", lists);
        System.out.println("join1 = " + join1);
    }
}
