package com.gyf.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration //自动配置spring配置文件
public class HelloController {
    @RequestMapping("hello/{name}")
    public  String hello(@PathVariable("name")  String name){
        return name+"hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloController.class,args);
    }
}
