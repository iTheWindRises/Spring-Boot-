package com.zwj.springboot;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring 应用事件引导类
 */
public class SpringApplicationEventBootstrap {

    public static void main(String[] args) {
        //创建上下文
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        //注册应用监听器
        context.addApplicationListener(event -> {
            System.out.println("监听到事件: "+event);
        });

        //启动上下文
        context.refresh();

        context.publishEvent("helloworld");
        context.publishEvent("2018");
        context.publishEvent(new ApplicationEvent("hello wj") {

        });
        //关闭上下文
        context.close();
    }
}
