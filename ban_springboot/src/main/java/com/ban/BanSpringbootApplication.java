package com.ban;

import com.ban.config.WebSocketServerOne;
import com.ban.entity.sys_user;
import com.ban.service.SysUserService;
import org.jasypt.encryption.StringEncryptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
@EnableAsync
@EnableWebSocket
@SpringBootApplication
@MapperScan({"com.ban.mapper"})
public class BanSpringbootApplication implements CommandLineRunner, ApplicationRunner {

    //extends SpringBootServletInitializer


    // @EnableWebSocket
    // ServerEndpointExporter 这个类是 spring-boot-starter-websocket 提供的。所以必须要导入这个依赖
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter ();
    }

    // configuration 注解 包含 component注解 启动类也是组件 可以注入
    @Bean
    People people(){
        return new People();
    }

    @Autowired
    private  People people;

    @Autowired
    private SysUserService sysUserService;

    // 推 荐 使用 Java 8 , Spring boot 1.x 系列的版本 兼容 Java 6 , Spring boot 2.x
    // SpringBoot 程序， 每个类应该有一个包，没有包的话会出现问题
    // @SpringBootApplication == @SpringBootConfiguration(@Configuration(@Component)) + @EnableAutoConfiguration + @ComponentScan
    // 延迟初始化bean: 运行时才会解析 spring.main.lazy-initialization=true


    public static void main(String[] args) {
        //SpringApplication springApplication = SpringApplication.run(BanSpringbootApplication.class, args);

        //        SpringApplication springApplication = new SpringApplication();
        //        var set = new LinkedHashSet(Arrays.asList(BanSpringbootApplication.class));
        //        springApplication.setSources(set);
        //        springApplication.run(args);

        ConfigurableApplicationContext run = new SpringApplicationBuilder()
                //.main(BanSpringbootApplication.class)
                .bannerMode(Banner.Mode.OFF)
                .run(args);
        Object people = run.getBean("people");
        System.out.println(people);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("ApplicationRunner run..." + people);
    }

    //@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
       return builder.sources(BanSpringbootApplication.class);
    }

    @Autowired
    private StringEncryptor stringEncryptor;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner run...");


        System.out.println("----------------------------");
        System.out.println(sysUserService);
        sys_user sys_user = sysUserService.loadUserById(1014549748341948418l);
        System.out.println(sys_user);

        System.out.println("----------------------------");
        String ban = stringEncryptor.encrypt("ban");
        System.out.println(ban);

        String decrypt = stringEncryptor.decrypt(ban);
        System.out.println(decrypt);
    }
}

class People {

}
