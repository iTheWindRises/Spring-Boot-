package com.zwj.web.boostrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program dive-in-spring-boot
 * @description:
 * @author: wj
 * @create: 2018/10/26 16:14
 */
@SpringBootApplication(scanBasePackages = "com.zwj.web")
public class SpringBootWebMvcBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebMvcBootstrap.class,args);
    }
}
