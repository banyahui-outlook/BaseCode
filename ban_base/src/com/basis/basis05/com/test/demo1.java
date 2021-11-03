package com.test;

import com.service.AccountService;

/**
 * @Creater banyahui
 * @Date 2019/12/01 上午 11:04
 * @Description 分层查询数据库，事务
 */
public class demo1 {
    public static void main(String[] args) {
        AccountService service = new AccountService();
        boolean jg = service.zz(1, 2, 50);
        System.out.println("jg = " + jg);
    }
}
