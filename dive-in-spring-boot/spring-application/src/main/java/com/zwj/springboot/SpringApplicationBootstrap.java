package com.zwj.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashSet;
import java.util.Set;

/**
 * 引导类
 */

public class SpringApplicationBootstrap {

    public static void main(String[] args) {
        //SpringApplication.run(ApplicationConfiguration.class,args);


        Set<String> sources = new HashSet<>();

        //配置Class名称
        sources.add(ApplicationConfiguration.class.getName());
        SpringApplication springApplication = new SpringApplication();
        springApplication.setSources(sources);
        ConfigurableApplicationContext context = springApplication.run(args);

        //System.out.println("Bean : " + context.getBean(ApplicationConfiguration.class));
    }

    @SpringBootApplication
    public static class ApplicationConfiguration{}
}
