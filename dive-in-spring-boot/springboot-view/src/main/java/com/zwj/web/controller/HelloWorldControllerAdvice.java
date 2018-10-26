package com.zwj.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * HelloWorldController 通知
 */
@ControllerAdvice(assignableTypes = HelloWorldController.class)
public class HelloWorldControllerAdvice {

    @ModelAttribute("message")
    public String message() {
        return "hello world";
    }


    @ModelAttribute("jsessionId")
    public String jsessionId(@CookieValue(value = "JSESSIONID",required = false)String jsessionId) {
        return jsessionId;
    }

    @ModelAttribute("acceptLanguage")
    public String acceptLanguage(@RequestHeader("Accept-Language") String acceptLanguage) {
        return acceptLanguage;
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> onException(Exception e) {
        System.out.println(e.getMessage());
        return ResponseEntity.ok(e.getMessage());
    }
}
