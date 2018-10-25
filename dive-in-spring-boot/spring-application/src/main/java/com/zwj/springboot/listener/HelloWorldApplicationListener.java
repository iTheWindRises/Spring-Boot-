package com.zwj.springboot.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * HelloWorld ApplicationListener 加载
 * 监听ContextRefreshedEvent
 */

@Order(Ordered.HIGHEST_PRECEDENCE)
public class HelloWorldApplicationListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("Hello World:"+contextRefreshedEvent.getApplicationContext().getId()+
                "timestamp:"+contextRefreshedEvent.getTimestamp());
    }
}
