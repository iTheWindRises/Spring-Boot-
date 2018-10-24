package com.zwj.springbootdive.annotation;

import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

/**
 * 二级 {@link Repository @Repository}
 *
 *
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@FirstLevelRepository
public @interface SecondLevelRepository {
    String value() default "";
}
