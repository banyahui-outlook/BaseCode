package com.test;

import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @Creater banyahui
 * @Date 2019/11/24 上午 0:15
 * @Description HashSet linkedHashSet
 */
public class demo10 {
    public static void main(String[] args) {
        Set<Integer> sets = new HashSet<>();
        sets.add(123);
        sets.add(456);
        sets.add(888);
        sets.add(123);

        System.out.println("sets = " + sets);

        Set<Integer> sets2 = new LinkedHashSet<>();
        sets2.add(123);
        sets2.add(456);
        sets2.add(888);
        sets2.add(123);
        System.out.println("sets2 = " + sets2);
    }

    @Test
    public void testJunit() {
        System.out.println("test junit...");
    }
}
