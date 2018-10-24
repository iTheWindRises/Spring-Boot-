package com.zwj.springbootdive.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * EnableAutoConfiguration 引导类
 */
@EnableAutoConfiguration
public class EnableAutoConfigurationBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableAutoConfigurationBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);


        //myFirstLevelRepository Bean 是否存在
        String helloWorld =
                context.getBean("helloWorld", String.class);

        System.out.println("helloWorld Bean 是否存在: "+helloWorld);

        context.close();
    }
}
