package com.ban.grammar;

// 数据类型
public class DataType {
    // 3种注释类型 //   /* */   /** **/ 文档注释

    // 关键字 全小写

    // 数据类型 4类8种 [基本数据类型]
    //  【数字】 byte(1) short(2) int(4) long(8)
    //  【是否】 boolean(1)
    //  【字符】 char(2)
    //  【浮点】 float(4) double(8)
    // 数据类型 [引用数据类型]
    //   class interface array

    //    整数缓冲区
    //    Java预先创建了256个常用的整数包装类型对象。 Interger,Byte,Short,Long 缓存了256基础整数，对象引用一致
    //    在实际应用中，对已创建的对象进行复用。

    // 类型自动转换  byte、short、char->int->long->float->double

    // 包装类
    public static void main(String[] args) {
        // Byte
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        // Short
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        // Integer
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        // Long
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        // Character
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);

        // Float
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        // Double
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);


        // 整数缓冲区 new 基本包装类已废弃 使用 valueOf
        //        public static Integer valueOf(int i) {
        //            if (i >= Integer.IntegerCache.low && i <= Integer.IntegerCache.high)
        //                return Integer.IntegerCache.cache[i + (-Integer.IntegerCache.low)];
        //            return new Integer(i);
        //        }
        System.out.println("===================================");
        Integer c1 = Integer.valueOf(127);
        Integer c2 = Integer.valueOf(127);
        System.out.println(c1==c2);

        Integer d1 = Integer.valueOf(128);
        Integer d2 = Integer.valueOf(128);
        System.out.println(d1==d2);
    }
}
