package com.ban.collect;

// 泛型
public class TFan {
    // 泛型的本质是为了参数化类型（在不创建新的类型的情况下，通过泛型指定的不同类型来控制形参具体限制的类型）
    // 泛型有三种使用方式，分别为：泛型类、泛型接口、泛型方法

    /**
     * 泛型方法的基本介绍
     * @param tClass 传入的泛型实参
     * @return T 返回值为T类型
     * 说明：
     *     1）public 与 返回值中间<T>非常重要，可以理解为声明此方法为泛型方法。
     *     2）只有声明了<T>的方法才是泛型方法，泛型类中的使用了泛型的成员方法并不是泛型方法。
     *     3）<T>表明该方法将使用泛型类型T，此时才可以在方法中使用泛型类型T。
     *     4）与泛型类的定义一样，此处T可以随便写为任意标识，常见的如T、E、K、V等形式的参数常用于表示泛型。
     */
    public <T> T genericMethod(Class <T> tClass) throws Exception{
//        T instance = tClass.newInstance();
//        return instance;
        return  null;
    }

    //在泛型方法中添加上下边界限制的时候，必须在权限声明与返回值之间的<T>上添加上下边界，即在泛型声明的时候添加
    //public <T> T showKeyName(Generic<T extends Number> container)，编译器会报错："Unexpected bound"
    public static  <T extends Number> T showKeyName(people<T> container){
        System.out.println("container key :" + container.getT());
        T test = container.getT();
        return test;
    }
    public static void main(String[] args) {
        showKeyName(new people<Integer>());
    }

    // 泛型类
    public static class people<T> {
        private T t;
        private T getT(){
            return this.t;
        }
    }

    // 泛型接口
    public interface Generator<T> {
        public T next();
    }
}
