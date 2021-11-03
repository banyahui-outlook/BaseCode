package com.test3;

import com.dao.TestClass;

import java.io.*;

/**
 * @Creater banyahui
 * @Date 2019/11/24 下午 21:26
 * @Description 序列化流
 */
public class demo9 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TestClass student = new TestClass("山三");
        String path = "E:\\Develop\\Java\\Workspace\\Basis\\out\\6.txt";
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(path));
        os.writeObject(student);
        os.close();


        ObjectInputStream oi = new ObjectInputStream(new FileInputStream(path));
        TestClass s2 = (TestClass) oi.readObject();
        System.out.println("s2.getName() = " + s2.getName());
    }
}
