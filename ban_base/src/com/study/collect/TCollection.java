package com.ban.collect;

// collection 顶层接口
public class TCollection {
    // collection 接口方法  jdk8 stream流式处理
    //1. add(E e) : 向集合中添加元素
    //2. addAll(Collection<? extends E> c) : 向集合中添加一组数据
    //3. clear() ：清空集合数据
    //4. contains( Object o) : 查找数据是否存在.(需要使用equals()方法).
    //5. remove( Object o) : 删除数据.(需要使用equals()方法).
    //6. size() : 取得集合长度
    //7. toArray() : 将集合变为对象数组返回
    //8. iterator() : 取得Iterator接口对象,用于集合输出.

    // collection 迭代器  并发修改异常   增强for内部使用迭代器

    // Collection 接口的接口 对象的集合（单列集合）
    //├——-List 接口：元素按进入先后有序保存，可重复
    //│—————-├ LinkedList 接口实现类， 链表， 插入删除， 没有同步， 线程不安全
    //│—————-├ ArrayList 接口实现类， 数组， 随机访问， 没有同步， 线程不安全
    //│—————-└ Vector 接口实现类 数组， 同步， 线程安全
    //│ ———————-└ Stack 是Vector类的实现类
    //└——-Set 接口： 仅接收一次，不可重复，并做内部排序
    //├—————-└HashSet 使用hash表（数组）存储元素
    //│————————└ LinkedHashSet 链表维护元素的插入次序
    //└ —————-TreeSet 底层实现为二叉树，元素排好序

    // 并发修改 对应类
    //HashMap	ConcurrentHashMap<K,V>	Hashtable虽然线程安全但不支持并发修改
    //LinkedHashMap	ConcurrentSkipListMap<K,V>	支持排序，且并发安全
    //LinkedHashSet	ConcurrentSkipListSet	支持排序，且不允许有重复元素
    //Queue	ConcurrentLinkedQueue	只能操作队列头
    //Deque	ConcurrentLinkedDeque	队头队尾都可操作
    //ArrayList	CopyOnWriteArrayList	支持并发安全
    //HashSet	CopyOnWriteArraySet	支持并发安全


    // https://blog.csdn.net/feiyanaffection/article/details/81394745
    public static void main(String[] args) {

    }
}
