package com.dao;

import com.domain.account;
import com.util.BaseUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Creater banyahui
 * @Date 2019/12/02 下午 16:13
 * @Description
 */
public class BaseDao<E> {
    private Connection _con;

    public Connection getCon() {
        return BaseUtil.getCon();
    }

    public Class getGeneric() {
        Class clasz = null;
        Type genericSuperclass = this.getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            return  (Class)(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        return clasz;
    }

    public boolean update(String sql, Object[] param) throws SQLException {
        QueryRunner queryRunner = new QueryRunner();
        int row = queryRunner.update(getCon(), sql, param);
        return row > 0;
    }

    public E getModel(String sql, Object[] params) throws SQLException {
        QueryRunner queryRunner = new QueryRunner();
        Object omodel = queryRunner.query(getCon(),sql, new BeanHandler(account.class),params);
        return (E) omodel;
    }
}
