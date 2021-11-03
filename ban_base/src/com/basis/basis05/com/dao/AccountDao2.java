package com.dao;

import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Creater banyahui
 * @Date 2019/12/01 上午 11:23
 * @Description
 */
public class AccountDao2 {
    public boolean addMoney(Connection con, int id, double money) {
        QueryRunner queryRunner = new QueryRunner();
        String sql = "update account set money=money" + (money > 0 ? "+" : "") + "? where id=?";
        Object[] param = {money, id};
        int update = 0;
        try {
            update = queryRunner.update(con, sql, param);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (update > 0) return true;
        return false;
    }
}
