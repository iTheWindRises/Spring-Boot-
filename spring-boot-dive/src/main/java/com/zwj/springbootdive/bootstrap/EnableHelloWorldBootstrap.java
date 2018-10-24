package com.zwj.springbootdive.bootstrap;

import com.zwj.springbootdive.annotation.EnableHelloWorld;
import com.zwj.springbootdive.configuration.HelloWorldConfiguration;
import com.zwj.springbootdive.repository.MyFirstLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**基于接口驱动实现 - @EnableServer
 * 仓储的引导类
 */
@EnableHelloWorld
public class EnableHelloWorldBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableHelloWorldBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        //myFirstLevelRepository Bean 是否存在
        String helloWorld =
                context.getBean("helloWorld", String.class);

        System.out.println("helloWorld Bean : "+helloWorld);
        //关闭上下文
        context.close();
    }
}
