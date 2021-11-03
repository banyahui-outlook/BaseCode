package com.test;

import com.domain.user;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @Creater banyahui
 * @Date 2019/11/29 下午 17:30
 * @Description c3p0
 */
public class demo6 {
    public static void main(String[] args) throws SQLException {
        ComboPooledDataSource source = new ComboPooledDataSource();
        System.out.println("source...");
        Connection con = source.getConnection();

        QueryRunner queryRunner = new QueryRunner();
        List<user> lists = queryRunner.query(con, "select * from user", new BeanListHandler<user>(user.class));
        for (user list : lists) {
            System.out.println("list = " + list);
        }
    }
}
