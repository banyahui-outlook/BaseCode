package com.test;

import com.service.AccountService3;

/**
 * @Creater banyahui
 * @Date 2019/12/02 下午 16:57
 * @Description 继承基类方式进行更新
 */
public class demo3 {
    public static void main(String[] args) {
        AccountService3 service = new AccountService3();
        boolean jg = service.zz(1, 2, 50);
        System.out.println("jg = " + jg);
    }
}
