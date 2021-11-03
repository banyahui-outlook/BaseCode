package com.ban.grammar;

// 第一个程序
public class HelloWord {
    // java 运行原理 javac-class->java-run

    // classloader 双亲委派
    // 加载、[验证、准备、解析](连接)、初始化、使用和卸载 7个阶段
    // https://blog.csdn.net/u014634338/article/details/81434327

    public static void main(String[] args) {
        System.out.println("hello!");
    }
}
