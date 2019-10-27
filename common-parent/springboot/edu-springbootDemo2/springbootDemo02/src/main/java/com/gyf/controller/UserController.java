package com.gyf.controller;

import com.gyf.model.Customer;
import com.gyf.model.User;
import com.gyf.test1.service.UserServiceImpl;
import com.gyf.test2.service.CustomerServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
//@EnableAutoConfiguration //自动配置spring配置文件
@RequestMapping("user")
public class UserController {

    @Autowired
//    private IUserService userService;
    private UserServiceImpl userService;
    @Autowired
    private CustomerServiceImpl customerService;
//    @RequestMapping("{id}")
//    @ResponseBody
//    public User userInfo(@PathVariable("id") Integer id) {
//        User user = new User("巢传维", "123");
//        user.setId(id);
//        return user;
//    }
//    @RequestMapping("register")
//    @ResponseBody
//    public String register(String username,String password){
//         userService.register(username,password);
//         return "success";
//    }
//    @RequestMapping("query")
//    @ResponseBody
//    public User findByUsername(String username){
//        return userService.findByUsername(username);
//    }

    @RequestMapping("add")
    @ResponseBody
    public String register(String username){
        //把数据保存到test1数据库
        userService.register(username,"100");
        //把数据保存到test2数据库
        customerService.register(username,"120");
        return "success";
    }
    @RequestMapping("findCustomerByName")
    @ResponseBody
    public Customer findc(String name){
        return customerService.find(name);
    }
    @RequestMapping("findUser")
    @ResponseBody
    public User findu(String name){

        return userService.find(name);
    }
}


