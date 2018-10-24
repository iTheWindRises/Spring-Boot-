package com.zwj.springbootdive.annotation;

import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

/**
 * 一级 {@link Repository @Repository}
 *
 *
 *
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
//@Import(HelloWorldConfiguration.class)
@Import(HelloWorldImportSelector.class)
public @interface EnableHelloWorld  {
}
