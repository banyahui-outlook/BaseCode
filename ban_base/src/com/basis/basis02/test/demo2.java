package com.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Creater banyahui
 * @Date 2019/11/23 下午 23:23
 * @Description Date
 */
public class demo2 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sf=new SimpleDateFormat("yyyyMMdd");
        String sdata = sf.format(date);
        System.out.println("sdata = " + sdata);

        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE,-1);

        String format = sf.format(calendar.getTime());
        System.out.println("format = " + format);
    }
}
