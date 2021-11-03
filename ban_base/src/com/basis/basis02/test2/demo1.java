package com.test2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Creater banyahui
 * @Date 2019/11/24 上午 10:56
 * @Description Map HashMap
 */
public class demo1 {
    public static void main(String[] args) {
        Map<String, String> maps = new HashMap<>();
        maps.put("zhangsan", "one");
        maps.put("lisi", "two");

        Set<Map.Entry<String, String>> entries = maps.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            var key = entry.getKey();
            System.out.println("key = " + key);
        }

        String zhangsan = maps.get("zhangsan");
        System.out.println("zhangsan = " + zhangsan);

        boolean axxx = maps.containsKey("axxx");
        System.out.println("axxx = " + axxx);

        Iterator<Map.Entry<String, String>> iterator = maps.entrySet().stream().filter((a) -> {
            return a.getKey() == "lisi";
        }).iterator();
        while (iterator.hasNext()) {
            System.out.println("iterator,filter = " + iterator.next());
        }

    }
}
