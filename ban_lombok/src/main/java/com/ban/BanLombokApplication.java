package com.ban;

import com.ban.model.User01;
import com.ban.model.User02;
import com.ban.model.User05;
import com.ban.model.User06;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BanLombokApplication {

    public static void main(String[] args) {
        SpringApplication.run(BanLombokApplication.class, args);

        // 1.Getter , AllArgsConstructor , NoArgsConstructor
        User01 user01 = new User01();
        user01 = new User01("zhangsan", 20);

        // 2.Setter
        User02 user02 = new User02();
        user02.setName("lisi");
        System.out.println(user02.getName());
        // var
        var user06 = new User06();
        user06.setName("wangwu");
        System.out.println(user06);
        // user06 = user01;
    }

}
