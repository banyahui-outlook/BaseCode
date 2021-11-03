package com.test3;

import java.io.IOException;
import java.net.Socket;

/**
 * @Creater banyahui
 * @Date 2019/11/24 下午 21:42
 * @Description Socket Client
 */
public class demo11 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8889);
        /*OutputStream outputStream = socket.getOutputStream();

        System.out.println("outputStream = " + (outputStream==null));
        outputStream.write("aaaaaeae".getBytes());
        outputStream.flush();
        outputStream.write("湛山。。。".getBytes());
        outputStream.close();*/
    }
}
