package com.yuxiu.edu.web.controller;


import com.yuxiu.edu.mdoel.User;
import com.yuxiu.edu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping("login")
    public String login(){
        System.out.println("这是usercontroller的login方法");
        return "Default";
    }
    @RequestMapping("find")
    public String find(Integer id){
        System.out.println("通过Id来查找用户");
        User user=userService.findById(id);
        System.out.println(user);
        return null;
    }
    @RequestMapping("manage")
    public String manage(){
        System.out.println("manage");
        return "User/UserManage";
    }
    @RequestMapping("info")
    public String info(){
        System.out.println("info");
        return "User/UserInfo";
    }
    @RequestMapping("edit")
    public String edit(){
        System.out.println("edit");
        return "User/UserEdit";
    }
}
