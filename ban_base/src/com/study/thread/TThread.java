package com.ban.thread;

// 线程
public class TThread {
    // 线程状态 创建(new)、就绪(runnable)、运行(running)、阻塞(blocked)、time waiting、waiting、消亡（dead）
    // start()[run()]  sleep()  yield() join() interrupt

    // 静态方法currentThread()用来获取当前线程。
    // getId: 用来得到线程ID
    // getName和setName  用来得到或者设置线程名称。
    // getPriority和setPriority 用来获取和设置线程优先级。
    // setDaemon和isDaemon 设置线程是否成为守护线程和判断线程是否是守护线程

    // 创建线程的2种方式 new Thread(class impl Runacle)   impl Runable

    // Runable 采用模板方法模式设计
    // Runable 函数式接口，采用lambda表达式进行简化
    //
}
