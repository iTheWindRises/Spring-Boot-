package com.zwj.springboot.listener;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.core.Ordered;
import org.springframework.core.env.Environment;

/**
 * Before 在ConfigFileApplicationListener 实现
 * Ordered.HIGHEST_PRECEDENCE+9
 */
public class BeforeConfigFileApplicationListener implements SmartApplicationListener,Ordered {

    public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
        return ApplicationEnvironmentPreparedEvent.class.isAssignableFrom(eventType) || ApplicationPreparedEvent.class.isAssignableFrom(eventType);
    }

    public boolean supportsSourceType(Class<?> aClass) {
        return true;
    }

    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof ApplicationEnvironmentPreparedEvent) {
            ApplicationEnvironmentPreparedEvent preparedEvent = (ApplicationEnvironmentPreparedEvent) event;
            Environment environment = preparedEvent.getEnvironment();
            System.out.println("environment.getProperty:"+environment.getProperty("name"));
        }

        if (event instanceof ApplicationPreparedEvent) {
        }

    }

    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE+9;
    }
}
