package com.test;

import java.sql.*;

/**
 * @Creater banyahui
 * @Date 2019/11/25 下午 21:52
 * @Description jdbc
 */
public class demo4 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jemp?serverTimezone=GMT", "jemp", "jemp");
        PreparedStatement sta = con.prepareStatement("select * from user");
        ResultSet resultSet = sta.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            System.out.println("id = " + id);
            String name = resultSet.getString(2);
            System.out.println("name = " + name);
            int age = resultSet.getInt(3);
            System.out.println("age = " + age);
        }

        Statement statement = con.createStatement();

        System.out.println("----------------------");
        PreparedStatement sta2=con.prepareStatement("select * from user where id=? ");
        sta2.setInt(1,2);
        ResultSet resultSet2 = sta2.executeQuery();
        while (resultSet2.next()) {
            int id = resultSet2.getInt(1);
            System.out.println("id = " + id);
            String name = resultSet2.getString(2);
            System.out.println("name = " + name);
            int age = resultSet2.getInt(3);
            System.out.println("age = " + age);
        }



    }
}
