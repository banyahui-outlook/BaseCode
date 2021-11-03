package com.service;

import com.dao.AccountDao3;
import com.domain.account;
import com.util.BaseUtil;
import org.apache.commons.dbutils.DbUtils;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Creater banyahui
 * @Date 2019/12/01 上午 11:23
 * @Description
 */
public class AccountService3 {
    public boolean zz(int from, int to, double money) {
        Connection con = null;
        try {
            con = BaseUtil.getCon();
        } catch (Exception ex) {
            System.out.println("获取连接异常：" + ex.getMessage());
            return false;
        }
        if (con == null) {
            System.out.println("数据库连接为空...");
            return false;
        }

        try {
            AccountDao3 dao = new AccountDao3();
            con.setAutoCommit(false);

            boolean up = dao.addMoney(from, 0 - money);
            System.out.println("账户减 " + up);
            //int x = 1 / 0;
            up = dao.addMoney(to, money);
            System.out.println("账户加 " + up);

            DbUtils.commitAndCloseQuietly(con);
            return up;
        } catch (SQLException e) {
            System.out.println("转账异常：" + e.getMessage());
            if (con != null) {
                DbUtils.rollbackAndCloseQuietly(con);
            }
            return false;
        }
    }

    public account getAccount(){
        AccountDao3 dao=new AccountDao3();
        account account = null;
        try {
            account = dao.getAccount(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  account;
    }
}
