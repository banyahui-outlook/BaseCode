package com.test;

import com.service.AccountService2;

/**
 * @Creater banyahui
 * @Date 2019/12/01 上午 11:12
 * @Description ThreadLocal
 */
public class demo2 {
    public static void main(String[] args) {
        AccountService2 service = new AccountService2();
        boolean jg = service.zz(1, 2, 50);
        System.out.println("jg = " + jg);
    }
}
