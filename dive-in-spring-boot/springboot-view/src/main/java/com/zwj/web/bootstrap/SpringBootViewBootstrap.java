package com.zwj.web.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program dive-in-spring-boot
 * @description:
 * @author: wj
 * @create: 2018/10/26 20:02
 */
@SpringBootApplication(scanBasePackages = "com.zwj.web")
public class SpringBootViewBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootViewBootstrap.class,args);
    }
}
