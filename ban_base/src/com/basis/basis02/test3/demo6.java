package com.test3;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Creater banyahui
 * @Date 2019/11/24 下午 20:51
 * @Description FileInputStream按照数组读取
 */
public class demo6 {
    public static <Char> void main(String[] args) throws IOException {
        String path = "E:\\Develop\\Java\\Workspace\\Basis\\out\\1.txt";
        FileInputStream fs = new FileInputStream(path);

        byte[] data = new byte[2];
        while (fs.read(data) > -1) {
            System.out.println("data = " + new String(data));
        }

        FileReader fr = new FileReader(path);
        int xxx = -1;
        while ((xxx = fr.read()) > -1) {
            System.out.println("(Char)xxx = " + (char) xxx);
        }

        //fr = new FileReader(path);
        char[] data2 = new char[1];
        while ((fr.read(data2)) > -1) {
            System.out.println("x = " + new String(data2));
        }
        fr.close();

    }
}
