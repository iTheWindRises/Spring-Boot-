package com.zwj.springboot.listener;


import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * After HelloWorldApplicationListener 加载
 * 监听ContextRefreshedEvent
 */
@Order(Ordered.LOWEST_PRECEDENCE)
public class AfterHelloWorldApplicationListener
    implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("After:"+contextRefreshedEvent.getApplicationContext().getId()+
                "timestamp:"+contextRefreshedEvent.getTimestamp());
    }


}
