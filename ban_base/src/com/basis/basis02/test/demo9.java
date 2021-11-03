package com.test;

import java.util.LinkedList;

/**
 * @Creater banyahui
 * @Date 2019/11/24 上午 0:04
 * @Description linkedlist 双向列表
 */
public class demo9 {
    public static void main(String[] args) {
        LinkedList<String> llist = new LinkedList<>();
        llist.add("asdv");
        llist.add("vvvvv");
        llist.addFirst("nnnnnnn");
        llist.addLast("eeeeeeee");

        System.out.println("llist = " + llist);
        String pop = llist.pop();
        System.out.println("pop = " + pop);

        System.out.println("llist = " + llist);
        String peek = llist.peek();
        System.out.println("peek = " + peek);
        System.out.println("llist = " + llist);

        String poll = llist.poll();
        System.out.println("poll = " + poll);
        System.out.println("llist = " + llist);

        String s = llist.pollLast();
        System.out.println("s = " + s);
        System.out.println("llist = " + llist);
    }
}
