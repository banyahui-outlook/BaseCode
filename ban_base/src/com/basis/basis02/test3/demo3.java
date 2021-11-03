package com.test3;

import java.io.File;
import java.net.URI;

/**
 * @Creater banyahui
 * @Date 2019/11/24 下午 20:13
 * @Description File
 */
public class demo3 {
    public static void main(String[] args) {
        String path="E:\\Develop\\Java\\Workspace\\Basis\\out\\1.txt";
        File file=new File(path);
        boolean exists = file.exists();
        System.out.println("exists = " + exists);

        String name = file.getName();
        System.out.println("name = " + name);

        File absoluteFile = file.getAbsoluteFile();
        System.out.println("absoluteFile = " + absoluteFile);

        URI uri = file.toURI();
        System.out.println("uri = " + uri);

        System.out.println("file = " + file.length());

        System.out.println("file.isDirectory() = " + file.isDirectory());


    }
}
