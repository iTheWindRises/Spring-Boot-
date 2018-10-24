package com.zwj.springbootdive.repository;

import com.zwj.springbootdive.annotation.FirstLevelRepository;
import com.zwj.springbootdive.annotation.SecondLevelRepository;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SecondLevelRepository(value = "myFirstLevelRepository") //bean名称
public class MyFirstLevelRepository {
}
