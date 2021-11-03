package com.ban.obj;

// 内部类
public class InnerClass {
    // 内部类细节   成员内部类（类对象内定义类） 局部内部类（方法内定义类）
    // 相对独立，可以访问外部类信息，外部类不能进行访问内部类，可以通过外部类初始化间接访问

    // 静态内部类  Outer.Inner in = Outer.new Inner();
    // 非静态内部类 Outer.Inner in = new Outer().new Inner();

    // 匿名内部类 （前提有接口或者抽象类， 不定义类直接new）
    //    1.匿名内部类必须继承一个抽象类或者实现一个接口。
    //    2.匿名内部类没有类名，因此没有构造方法。

    public static void main(String[] args) {

        // 匿名内部类
        int i = new Comparable<Integer>() {
            @Override
            public int compareTo(Integer o) {
                if (o < 1) return -1;
                return o;
            }
        }.compareTo(1);
        System.out.println(i);

        // 局部内部类
        class animal{
            private String name;
        }
    }

    // 成员内部类
    class people{
        private String name;
    }
}
