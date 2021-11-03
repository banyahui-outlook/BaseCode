package com.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Creater banyahui
 * @Date 2019/12/02 下午 16:19
 * @Description
 */
public class BaseUtil {
    private static DataSource dataSource = new ComboPooledDataSource();
    private static ThreadLocal<Connection> cons = new ThreadLocal<>();

    public static Connection getCon() {
        Connection con = null;
        if (cons.get() == null) {
            try {
                con = dataSource.getConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            cons.set(con);
        } else {
            con = cons.get();
        }
        return con;
    }
}
