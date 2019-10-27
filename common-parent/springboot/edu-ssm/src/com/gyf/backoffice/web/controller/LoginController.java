package com.gyf.backoffice.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
    @RequestMapping("login")
    public String list(String username, String password, HttpServletRequest httpServletRequest){
        if(username.equals("lyf")&&password.equals("123")){
            httpServletRequest.getSession().setAttribute("username",username);
            return "main";
        }else{
            return "login";
        }
    }

    @RequestMapping("dd")
    public String dd(){
        return "login";
    }
}
