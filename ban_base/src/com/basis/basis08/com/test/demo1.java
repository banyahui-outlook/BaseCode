package com.test;

import com.bean.account;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @Creater banyahui
 * @Date 2019/12/05 上午 10:04
 * @Description appche commons-beanutils
 */
public class demo1 {
    public static void main(String[] args) {
        account account=new account();
        account.setUserid(1); account.setAnum("aaa");
        account.setId(123);account.setMoney(9999.0);

        try {
            Map<String, String> describe = BeanUtils.describe(account);
            for (Map.Entry<String, String> stringStringEntry : describe.entrySet()) {
                System.out.println("stringStringEntry = " + stringStringEntry.getKey());
                System.out.println("stringStringEntry.getValue() = " + stringStringEntry.getValue());
            }

            BeanUtils.setProperty(account,"money",100);
            System.out.println("account = " + account);
            
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }



    }
}
