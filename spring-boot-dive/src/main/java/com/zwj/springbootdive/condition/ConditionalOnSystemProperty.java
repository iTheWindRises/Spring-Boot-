package com.zwj.springbootdive.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * Java 系统属性 条件判断
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@Documented
@Conditional(OnSystemPropertyCondition.class)
public @interface ConditionalOnSystemProperty {
    /**
     * Java系统属性的名称
     * @return
     */
    String name();

    /**
     * Java系统属性的值
     * @return
     */
    String value();
}
