package com.test;

import com.dao.MyTest;

/**
 * @Creater banyahui
 * @Date 2019/11/25 下午 21:48
 * @Description 自定义注解
 */
public class demo3 {
    @MyTest
    public void Show() {
        System.out.println("show...");
    }
}
