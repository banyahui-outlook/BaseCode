package com.test3;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @Creater banyahui
 * @Date 2019/11/24 下午 19:16
 * @Description 内置的几种函数式接口
 */
public class demo1 {
    public static void main(String[] args) {
        var cthen= new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("and then integer = " + integer);
            }
        };
        var con = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("integer = " + integer);
            }
        };
        con.andThen(cthen).accept(123);

        Supplier<Integer> supplier = new Supplier<>() {
            @Override
            public Integer get() {
                return 123;
            }
        };
        Integer integer = supplier.get();
        System.out.println("integer = " + integer);

        Function<String,Integer> funs=new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        };
        Integer apply = funs.apply("21");
        System.out.println("apply = " + apply);


        Predicate<String> pres=new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return !s.equals("xxx");
            }
        };
        boolean xxx = pres.negate().test("xxx");
        System.out.println("xxx是xxx?  : " + xxx);
    }
}
