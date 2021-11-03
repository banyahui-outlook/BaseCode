package com.ban.grammar;

// 流程控制
public class Order {
    // if  else if  else

    // switch jdk i.5(byte short char int) 1.5+ (枚举类与byte short char int的包装类) 1.7(String使用hashcode)
    // 可以认为只支持int

    // for  (;;)
    //    第一个句子是初始化用的，如果没有初始化的必要，就视为空语句，加上分号；
    //    第二个句子作为判断条件，如果没有判断条件，也视为空语句，后加一个分号。这种情况，会无限循环，相当于while(1)。如果for的执行部分，就是{}之间有break语句，可以退出；
    //    第三个句子是执行部分执行完毕再执行的语句；无则视为空语句；此时不用再加分号。
    //    如果三者都为空，那么表示没有初始化，没有判断条件，不执行语句。由没有判断条件，故为死循环，相当于while(true)

    // while () 变量在外层 继续使用 for 不行

    // for(;;) while(1) 编译结果一样

    // do {} while ()
    public static void main(String[] args) {
        // do while
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);
    }
}
