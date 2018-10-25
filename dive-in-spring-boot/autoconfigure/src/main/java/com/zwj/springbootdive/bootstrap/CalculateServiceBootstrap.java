package com.zwj.springbootdive.bootstrap;

import com.zwj.springbootdive.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 自定义条件装配 引导类
 */
@SpringBootApplication(scanBasePackages = "com.zwj.springbootdive.service")
public class CalculateServiceBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(CalculateServiceBootstrap.class)
                .web(WebApplicationType.NONE)
                .profiles("Java8")
                .run(args);



        CalculateService calculateService = context.getBean(CalculateService.class);

        System.out.println(calculateService.sum(1,2,3,4,5,6,7,8,9,10));

        context.close();
    }
}
