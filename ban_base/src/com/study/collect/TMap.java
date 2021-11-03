package com.ban.collect;

import java.util.HashMap;
import java.util.Map;

// map接口
public class TMap {
    //Map 接口 键值对的集合 （双列集合）
    //├———Hashtable 接口实现类， 同步， 线程安全
    //├———HashMap 接口实现类 ，没有同步， 线程不安全-
    //│—————–├ LinkedHashMap 双向链表和哈希表实现
    //│—————–└ WeakHashMap
    //├ ——–TreeMap 红黑树对所有的key进行排序
    //└———IdentifyHashMap

    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
    }
}
