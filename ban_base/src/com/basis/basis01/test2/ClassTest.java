package com.test2;

import com.dao.People;
import com.dao.Student;

/**
 * @Creater banyahui
 * @Date 2019/11/20 下午 15:53
 * @Description 类测试
 */
public class ClassTest {
    public static void main(String[] args) {
        People student = new Student("湛山", 18);
        student.eat();
    }
}
