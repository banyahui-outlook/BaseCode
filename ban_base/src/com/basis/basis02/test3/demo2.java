package com.test3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Creater banyahui
 * @Date 2019/11/24 下午 19:47
 * @Description stream
 */
public class demo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        list.stream().filter((s) -> s.startsWith("张"))
                .forEach((s) -> System.out.println("s = " + s));

        Stream<String> stream = list.stream();
        Iterator<String> iterator = stream.iterator();
        System.out.println("iterator = " + iterator.next());

        List<String> collect = list.stream().collect(Collectors.toList());
        for (String s : collect) {
            System.out.println("s = " + s);
        }

    }
}
