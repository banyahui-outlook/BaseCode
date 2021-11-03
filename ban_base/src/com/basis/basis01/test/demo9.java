package com.test;

import java.util.ArrayList;

/**
 * @Creater banyahui
 * @Date 2019/11/20 下午 15:04
 * @Description arraylist操作
 */
public class demo9 {
    public static void main(String[] args) {
        ArrayList<Integer> datas=new ArrayList<>();
        datas.add(123); datas.add(333);
        datas.add(998);datas.add(886);
        System.out.println("datas = " + datas);

        datas.remove(0);
        System.out.println("datas = " + datas);

        for (Integer data : datas) {
            System.out.println("data = " + data);
        }

        System.out.println("---------------------");
        for (Integer data : datas) {
            System.out.println("data2 = " + data);
//            if(data==998){
//                System.out.println("998 = " + 998);
//                datas.remove(Integer.valueOf(998));
//            }
        }


    }
}
