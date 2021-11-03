package com.test3;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Creater banyahui
 * @Date 2019/11/24 下午 21:09
 * @Description FileOutputStream FileWriter
 */
public class demo7 {
    public static void main(String[] args) throws IOException {
        String path = "E:\\Develop\\Java\\Workspace\\Basis\\out\\3.txt";
        FileOutputStream fs = new FileOutputStream(path);
        fs.write((int) '你');
        fs.write((int) '好');
        fs.write((int) 'J');
        fs.write((int) 'a');
        fs.write((int) 'v');
        fs.write((int) 'a');
        fs.close();


        FileWriter fw = new FileWriter(path);
        char[] data = "你好，java...".toCharArray();
        fw.write(data);
        fw.flush();
        fw.write("argin...".toCharArray());
        fw.close();


        //JDK7以后

        try (FileWriter fw2 = new FileWriter(path)) {
            fw2.write("aaaa");
            fw2.close();
        } catch (Exception ex) {

        }
    }
}
