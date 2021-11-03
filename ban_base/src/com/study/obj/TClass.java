package com.ban.obj;

// 类 对象
public class TClass {
    // 类(属性、行为的描述) 对象(类实例) 引用类型 内存在堆，栈引用

    // 封装（this:实例对象 构造方法 标准类） 另外2特性：继承，多态

    public static void main(String[] args) {
        people p=new people();
        String name = p.getName();
    }

    static class people {
        public people(){}

        private String name;
        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return this.name;
        }
    }
}
