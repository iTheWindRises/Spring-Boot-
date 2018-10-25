package com.zwj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.zwj.web.servlet")
public class SpringBootDiveApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(SpringBootDiveApplication.class)
				.run(args);
		//SpringApplication.run(SpringBootDiveApplication.class, args);
	}
}
