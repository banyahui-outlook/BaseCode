package com.test;

import com.domain.account;
import com.service.AccountService3;

/**
 * @Creater banyahui
 * @Date 2019/12/02 下午 17:00
 * @Description 获取泛型对象查询信息
 */
public class demo4 {
    public static void main(String[] args) {
        AccountService3 service = new AccountService3();
        account account = service.getAccount();
        System.out.println("account = " + account);
    }
}
