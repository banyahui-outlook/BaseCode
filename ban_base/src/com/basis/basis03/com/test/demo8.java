package com.test;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.domain.user;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.List;
import java.util.Properties;

/**
 * @Creater banyahui
 * @Date 2019/11/29 下午 17:30
 * @Description Druid
 */
public class demo8 {
    public static void main(String[] args) throws Exception {
        InputStream is = demo7.class.getClassLoader().getResourceAsStream("druid.properties");
        System.out.println("is = " + is);

        Properties properties = new Properties();
        properties.load(is);
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        Connection con = dataSource.getConnection();
        QueryRunner queryRunner = new QueryRunner();
        List<user> lists = queryRunner.query(con, "select * from user", new BeanListHandler<user>(user.class));
        for (user list : lists) {
            System.out.println("list = " + list);
        }

    }
}
