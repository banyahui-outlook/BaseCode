package com.test;

import com.domain.user;
import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javax.sql.DataSource;
import java.io.FileReader;
import java.io.InputStream;
import java.sql.Connection;
import java.util.List;
import java.util.Properties;

/**
 * @Creater banyahui
 * @Date 2019/11/29 下午 17:30
 * @Description dbcp
 */
public class demo7 {
    public static void main(String[] args) throws Exception {
        String filePath = "E:\\Develop\\Java\\Workspace\\Basis\\out\\test\\Basis03\\dbcp.properties";
        System.out.println("filePath = " + filePath);
        FileReader fileReader = new FileReader(filePath);

        InputStream is = demo7.class.getClassLoader().getResourceAsStream("dbcp.properties");
        System.out.println("is = " + is);

        System.out.println("file reader...");
        Properties properties = new Properties();
        properties.load(is);
        //properties.load(fileReader);//从文件中读取设置值
        DataSource dataSource = BasicDataSourceFactory.createDataSource(properties);//设置数据库连接池

        Connection con = dataSource.getConnection();
        QueryRunner queryRunner = new QueryRunner();
        List<user> lists = queryRunner.query(con, "select * from user", new BeanListHandler<user>(user.class));
        for (user list : lists) {
            System.out.println("list = " + list);
        }
    }
}
