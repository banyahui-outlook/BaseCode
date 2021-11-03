package com.service;

import com.dao.AccountDao;
import com.util.C3p0Util;
import org.apache.commons.dbutils.DbUtils;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Creater banyahui
 * @Date 2019/12/01 上午 11:23
 * @Description
 */
public class AccountService {
    public boolean zz(int from, int to, double money) {
        Connection con = null;
        try {
            AccountDao accountDao = new AccountDao();
            con = C3p0Util.getCon();

            //相当于开启事务
            con.setAutoCommit(false);

            boolean up = accountDao.addMoney(con, from, 0 - money);
            System.out.println("账户减 " + up);

            int x = 1 / 0;

            up = accountDao.addMoney(con, to, money);
            System.out.println("账户加 " + up);

            DbUtils.commitAndCloseQuietly(con);
            return up;
        } catch (SQLException e) {
            e.printStackTrace();
            if (con != null) DbUtils.rollbackAndCloseQuietly(con);
            return false;
        }
    }
}
