package com.test;

import com.alibaba.fastjson.JSON;
import com.bean.account;

/**
 * @Creater banyahui
 * @Date 2019/12/04 下午 12:05
 * @Description Fastjson解析json
 */
public class demo3 {
    public static void main(String[] args) {
        account account=new account();
        account.setUserid(1); account.setAnum("aaa");
        account.setId(123);account.setMoney(9999.0);

        String s = JSON.toJSONString(account);
        System.out.println("s = " + s);

        String ss="{\"anum\":\"bbbb\",\"id\":88,\"money\":888888.0,\"userid\":8}";
        com.bean.account account1 = JSON.parseObject(ss, account.getClass());
        System.out.println("account1 = " + account1);

    }
}
