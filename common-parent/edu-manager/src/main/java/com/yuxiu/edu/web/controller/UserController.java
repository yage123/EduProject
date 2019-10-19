package com.yuxiu.edu.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("login")
    public String login(){
        System.out.println("这是usercontroller的login方法");
        return null;
    }
}
