package com.test;

import com.bean.account;
import com.google.gson.Gson;

/**
 * @Creater banyahui
 * @Date 2019/12/04 下午 12:06
 * @Description gson解析json
 */
public class demo5 {
    public static void main(String[] args) {
        account account=new account();
        account.setUserid(1); account.setAnum("aaa");
        account.setId(123);account.setMoney(9999.0);

        Gson gson=new Gson();
        String s = gson.toJson(account);
        System.out.println("s = " + s);

        String text="{\"id\":88,\"userid\":8,\"anum\":\"888\",\"money\":8888.0}";
        com.bean.account account1 = gson.fromJson(text, account.getClass());
        System.out.println("account1 = " + account1);
    }
}
