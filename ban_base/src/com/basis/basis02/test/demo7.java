package com.test;

/**
 * @Creater banyahui
 * @Date 2019/11/23 下午 23:47
 * @Description 泛型
 */
public class demo7 {
    public static void main(String[] args) {
        Integer gete = gete(123);
        System.out.println("gete = " + gete);

        getx("1111");
    }

    public static <mvp> mvp gete(mvp param) {
        return param;
    }

    public static <mvp> void getx(mvp param) {
        System.out.println("xxxx" + param);
    }
}
