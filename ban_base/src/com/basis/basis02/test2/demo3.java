package com.test2;

import java.util.List;

/**
 * @Creater banyahui
 * @Date 2019/11/24 上午 11:12
 * @Description 异常
 */
public class demo3 {
    public static void main(String[] args) {
        try {
            int x=199/0;
        }catch (Exception ex){
            System.out.println("ex = " + ex.getMessage());
        }

        try {
            List<String> lists=null;
            int size=lists.size();
        }catch (Exception ex){
            System.out.println("ex = " + ex.getMessage());
        }
    }
}
