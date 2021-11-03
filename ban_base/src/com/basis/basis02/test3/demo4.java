package com.test3;

import java.io.File;

/**
 * @Creater banyahui
 * @Date 2019/11/24 下午 20:38
 * @Description Directory
 */
public class demo4 {
    public static void main(String[] args) {
        File file=new File("E:\\Develop\\Java\\Workspace\\Basis\\out");
        boolean directory = file.isDirectory();
        System.out.println("directory = " + directory);

        File[] files = file.listFiles();
        for (String s : file.list()) {
            System.out.println("s = " + s);
        }
    }
}
