package com.dao;

import com.domain.account;

import java.sql.SQLException;

/**
 * @Creater banyahui
 * @Date 2019/12/01 上午 11:23
 * @Description
 */
public class AccountDao3 extends BaseDao<account> {
    public boolean addMoney(int id, double money) throws SQLException {
        String sql = "update account set money=money" + (money > 0 ? "+" : "") + "? where id=?";
        Object[] param = {money, id};
        return update(sql, param);
    }

    public account getAccount(int id) throws SQLException {
        String sql = "select * from account where id=?";
        Object[] param = {id};
        return getModel(sql, param);
    }
}
