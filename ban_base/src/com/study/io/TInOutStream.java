package com.ban.io;

// inputStream / outputStream
public class TInOutStream {
    // 字节流的抽象基类  继承 Closeable(AutoCloseable)
    // inputstream
    // FileInputStream,DataInputStream,ObjectInputStream,BufferedInputStream,
    //    int read()// 读取并返回1字节数据，若返回-1，表示读到了输入流的末尾。
    //    int read(byte[] b)// 将数据读入一个字节数组，同时返回实际读取的字节数。如果返回-1，表示读到了输入流的末尾。
    //    int read(byte[] b, int off, int len)//将数据读入一个字节数组，同时返回实际读取的字节数。如果返回-1，表示读到了输入流的末尾，off指定在数组b中存放数据的起始偏移位置；len指定读取的最大字节数。
    //    long skip(long n)// 跳过和丢弃此输入流中数据的n个字节
    //    void close()// 关闭此输入流并释放与该流关联的所有系统资源。


    // outputstream
    // FileOutputStream,DataOutputStream,ObjectOutputStream,BufferedOutputStream
    //    void write(byte[] b)// 将b.length个字节从指定的byte数组写入此输出流
    //    void write(byte[] b, int off, int len)// 将指定byte数组中从偏移量off开始的len个字节写入此输出流
    //    void write(int b)// 将1字节写入此输出流
    //    void close() // 关闭此输出流并释放与此流有关的所有系统资源
    //    void flush() // 刷新此输出流并强制写出所有缓冲的输出字节

    // DateOutputStream写的文件，只能使用DataInputStream去读。并且度的时候需要提前知道写入的顺序。读的顺序要和写的顺序一致，才可以正常取出数量。

    //https://blog.csdn.net/jiahuan_/article/details/105310304
    //https://www.cnblogs.com/l-y-h/p/11093709.html
}
