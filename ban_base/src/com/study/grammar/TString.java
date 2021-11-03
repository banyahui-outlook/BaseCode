package com.ban.grammar;

// string相关 (stringbuilder stringbuffer StringJoiner)
public class TString {
    // string 本质char数组，不可变
    // 1.安全（值不改变，类不会被写） 2.共享
    // intern方法等于首次创建的对象的堆地址

    // stringbuilder 线程不安全
    // stringbuffer 线程安全
    //  没有实现Comparable接口，不能调用compareTo
    //  扩容策略   默认长度均为 16 ， append时 长度2* +2
    //  reverse  trimToSize

    // StringJoiner 封装了stringbuilder拼接方法
    public static void main(String[] args) {

    }
}
