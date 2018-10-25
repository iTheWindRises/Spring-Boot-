package com.zwj.springbootdive.configuration;

import com.zwj.springbootdive.annotation.EnableHelloWorld;
import com.zwj.springbootdive.condition.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * HelloWorld 自动装配
 */
@Configuration  //Spring 模式注解
@EnableHelloWorld //Spring @Enable 模块装配
@ConditionalOnSystemProperty(name = "user.name",value = "thewindrises") //条件装配
public class HelloWorldAutoConfiguration {

}
