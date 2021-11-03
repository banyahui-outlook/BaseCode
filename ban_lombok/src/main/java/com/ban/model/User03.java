package com.ban.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class User03 {
    private String name;
    private Integer age;

    // EqualsAndHashCode 生成 equals 和 hashCode 方法
    // ToString 指定类生成 toString 方法
}
