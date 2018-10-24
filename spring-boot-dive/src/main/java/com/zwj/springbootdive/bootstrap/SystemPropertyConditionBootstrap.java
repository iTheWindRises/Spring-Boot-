package com.zwj.springbootdive.bootstrap;

import com.zwj.springbootdive.condition.ConditionalOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 *  编程条件装配  系统属性引导类
 */
public class SystemPropertyConditionBootstrap {

    @Bean
    @ConditionalOnSystemProperty(name = "user.name",value = "thewindrises")
    public String helloWorld() {
        return "Hello World!!!";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(SystemPropertyConditionBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);


        String helloWorld = context.getBean("helloWorld", String.class);
        System.out.println("键值配对失败会报错"+helloWorld);
        //关闭上下文
        context.close();
    }
}
