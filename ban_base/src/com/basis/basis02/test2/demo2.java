package com.test2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Creater banyahui
 * @Date 2019/11/24 上午 11:04
 * @Description LinkedHashMap
 */
public class demo2 {
    public static void main(String[] args) {
        Map<String, String> maps = new LinkedHashMap<>();
        maps.put("one", "aaaaaa");
        maps.put("two", "bbbbbb");
        maps.put("three", "cccccc");
        maps.put("four", "dddddd");

        Iterator<String> iterator = maps.keySet().iterator();
        while (iterator.hasNext())
        {
            System.out.println("item:"+iterator.next());
        }
        
       Set<String> sets= maps.keySet();
        for (String set : sets) {
            System.out.println("set = " + set);
        }

        for (Map.Entry<String, String> stringStringEntry : maps.entrySet()) {
            System.out.println("stringStringEntry = " + stringStringEntry);
        }
    }
}
