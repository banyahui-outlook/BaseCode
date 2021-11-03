package com.ban.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class User01 {
    private String name;
    private Integer age;
    
// 双重检查锁 + AtomicReference
//    private final AtomicReference<java.lang.Object> cached = new AtomicReference<>();
//    public double[] getCached() {
//        java.lang.Object value = this.cached.get();
//        if (value == null) {
//            synchronized (this.cached) {
//                value = this.cached.get();
//                if (value == null) {
//                    final double[] actualValue = expensive();
//                    value = actualValue == null ? this.cached : actualValue;
//                    this.cached.set(value);
//                }
//            }
//        }
//        return (double[]) (value == this.cached ? null : value);
//    }

}
