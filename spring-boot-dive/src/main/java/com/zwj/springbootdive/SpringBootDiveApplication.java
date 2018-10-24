package com.zwj.springbootdive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
//@ServletComponentScan(basePackages = "com.zwj.springbootdive.web.servlet")
public class SpringBootDiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDiveApplication.class, args);
	}
}
