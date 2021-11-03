package com.ban.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@Accessors()
public class User04 {
    private String name;
    private Integer age;

// val 类等同于.net var , 不过不能赋值

    //@Data相当于
    //@ToString
    //@Getter
    //@Setter
    //@RequiredArgsConstructor
    //@EqualsAndHashCode

//    @Accessors
//    翻译是存取器。通过该注解可以控制getter和setter方法的形式。
//    fluent 若为true，则getter和setter方法的方法名都是属性名，且setter方法返回当前对象。
//    chain 若为true，则setter方法返回当前对象 (jdbc（反射）转实体的时候 chain为true会赋值为空！！！)
//    prefix 若为true，则getter和setter方法会忽视属性名的指定前缀（遵守驼峰命名） 自动去除前缀生成getset方法
}
