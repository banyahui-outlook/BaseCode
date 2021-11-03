package com.ban.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
public class User06 {
    private String name;
    private Integer age;

    //@Synchronized synchronized 关键字应用在实例方法时，锁定的是 this 对象，而应用在静态方法上锁定的是类对象。对于 @Synchronized 注解声明的方法来说，它锁定的是 $LOCK 或 $lock
    //@Builder  为指定类实现建造者模式，该注解可以放在类、构造函数或方法上
    //@SneakyThrows 注解用于自动抛出已检查的异常，而无需在方法中使用 throw 语句显式抛出
    //@NonNull 在方法或构造函数的参数上使用 @NonNull 注解，它将会为你自动生成非空校验  抛出NullPointerException
    //@Clean 生成try finally 自动关闭
    //@With 自动生成一个 withFieldName(newValue) 的方法，该方法会基于 newValue 调用相应构造函数，创建一个当前类对应的实例
}
