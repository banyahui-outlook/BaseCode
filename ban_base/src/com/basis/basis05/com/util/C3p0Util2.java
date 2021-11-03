package com.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Creater banyahui
 * @Date 2019/12/01 上午 11:14
 * @Description C3p0工具
 */
public class C3p0Util2 {
    private static ComboPooledDataSource dataSource = new ComboPooledDataSource();
    private static ThreadLocal<Connection> cons = new ThreadLocal<>();

    public static Connection getCon() throws SQLException {
        Connection con = cons.get();
        if (con == null) {
            con = dataSource.getConnection();
            cons.set(con);
        }
        return con;
    }
}
