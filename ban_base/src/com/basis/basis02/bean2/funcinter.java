package com.bean2;

/**
 * @Creater banyahui
 * @Date 2019/11/24 下午 14:26
 * @Description
 */
@FunctionalInterface
public interface funcinter {
    void comp();

    default void comp2(Integer x) {

    }
}
