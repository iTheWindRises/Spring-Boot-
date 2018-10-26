package com.zwj.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program dive-in-spring-boot
 * @description:
 * @author: wj
 * @create: 2018/10/26 19:58
 */
@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "hello-world";   //View 逻辑名称
    }

    @RequestMapping("")
    public String index(@RequestParam(required = false,defaultValue = "0") int value, Model model) {
        //model.addAttribute("message","HellWorld");
        System.out.println("hello world");
        return "index";
    }

    @ModelAttribute("message")
    public String message() {
        return "HelloWorld";
    }
}


