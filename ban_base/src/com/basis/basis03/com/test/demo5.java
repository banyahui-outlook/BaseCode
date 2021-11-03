package com.test;

import com.domain.user;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.List;

/**
 * @Creater banyahui
 * @Date 2019/11/29 下午 16:58
 * @Description DbUtil
 */
public class demo5 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException {
        //Class.forName("com.mysql.cj.jdbc.Driver");
        boolean ld = DbUtils.loadDriver("com.mysql.cj.jdbc.Driver");
        System.out.println("ld = " + ld);
        if (ld == false) {
            System.out.println("加载驱动失败...");
            return;
        }
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jemp?serverTimezone=GMT", "jemp", "jemp");
        //PreparedStatement preparedStatement = con.prepareStatement("select * from user");
        Savepoint savepoint = con.setSavepoint();
        PreparedStatement preparedStatement = con.prepareStatement("");
        preparedStatement.setBlob(1, new FileInputStream("a"));

        QueryRunner queryRunner = new QueryRunner();
        List<user> query = queryRunner.query(con, "select * from user", new BeanListHandler<user>(user.class));
        for (user user : query) {
            System.out.println("user = " + user);
        }
    }
}
