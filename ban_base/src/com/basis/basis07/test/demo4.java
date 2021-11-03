package com.test;

import com.bean.account;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * @Creater banyahui
 * @Date 2019/12/04 下午 12:06
 * @Description jsckson解析json
 */
public class demo4 {
    public static void main(String[] args) throws JsonProcessingException {
        account account=new account();
        account.setUserid(1); account.setAnum("aaa");
        account.setId(123);account.setMoney(9999.0);

        ObjectMapper mapper=new ObjectMapper();
        DateFormat format= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        mapper.setDateFormat(format);
        String s = mapper.writeValueAsString(account);
        System.out.println("s = " + s);

        String text="{\"id\":88,\"userid\":8,\"anum\":\"888\",\"money\":8888.0}";
        ObjectMapper mapper1=new ObjectMapper();
        //解析器支持解析单引号
        mapper1.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        com.bean.account account1 = mapper1.readValue(text, account.getClass());
        System.out.println("account1 = " + account1);
    }
}
