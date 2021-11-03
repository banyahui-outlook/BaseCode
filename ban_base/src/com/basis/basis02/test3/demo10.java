package com.test3;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Creater banyahui
 * @Date 2019/11/24 下午 21:41
 * @Description Socket Server
 */
public class demo10 {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(8888);
        Socket accept = socket.accept();
        InputStream inputStream = accept.getInputStream();
        byte[] data = new byte[2];
        while (inputStream.read(data) > -1) {
            System.out.println(" data= " + new String(data));
        }
    }
}
