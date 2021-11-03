package com.ban.io;

// reader / writer
public class TReaderWriter {
    // reader
    // FileReader,InputStreamReader,BufferedReader,PrintStream
    //    int read()// 读取并返回1字符数据，若返回-1，表示读到了输入流的末尾。
    //    int read(char[] b)// 将数据读入一个字符数组，同时返回实际读取的字符数。如果返回-1，表示读到了输入流的末尾。
    //    int read(char[] b, int off, int len)//将数据读入一个字符数组，同时返回实际读取的字符数。如果返回-1，表示读到了输入流的末尾，off指定在数组b中存放数据的起始偏移位置；len指定读取的最大字符数。
    //    long skip(long n)// 跳过和丢弃此输入流中数据的n个字符
    //    void close()// 关闭此输入流并释放与该流关联的所有系统资源。

    // writer
    // FileWriter,OutputStreamWriter,BufferedWriter,PrintWriter
    //    void write(char[] b)// 将b.length个字符从指定的byte数组写入此输出流
    //    void write(char[] b, int off, int len)// 将指定byte数组中从偏移量off开始的len个字符写入此输出流
    //    void write(int b)// 将1字符写入此输出流。
    //    void write(String b)// 将字符串写入此输出流
    //    void close() // 关闭此输出流并释放与此流有关的所有系统资源
    //    void flush() // 刷新此输出流并强制写出所有缓冲的输出字符

    // reader 特有方法
    // String readLine();一次读取一行字符串，若返回null,则表示无数据可读。
}
