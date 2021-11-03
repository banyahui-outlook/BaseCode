package com.test3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Creater banyahui
 * @Date 2019/11/24 下午 20:43
 * @Description FileInputStream
 */
public class demo5 {
    public static void main(String[] args) throws IOException {
        String path = "E:\\Develop\\Java\\Workspace\\Basis\\out\\1.txt";
        String path2 = "E:\\Develop\\Java\\Workspace\\Basis\\out\\2.txt";

        FileInputStream is = new FileInputStream(path);
        FileOutputStream os = new FileOutputStream(path2);

        int data;
        while ((data = is.read()) > -1) {
            System.out.println("data = " + data);
            os.write(data);
        }

        is.close(); os.close();
    }
}
