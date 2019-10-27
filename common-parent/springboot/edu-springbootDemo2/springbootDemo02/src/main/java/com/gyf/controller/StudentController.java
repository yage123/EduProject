package com.gyf.controller;


import com.gyf.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller   //controller和restcontroller的区别就是controller是用来给后台有页面返回数据使用的控制器而rest是给api移动客户端使用的
@RequestMapping("stu")
public class StudentController {
    @RequestMapping("list")
    public String list(Model model){
        model.addAttribute("cc2","巢传维");
        model.addAttribute("age",100);
        List<Student> lis=new ArrayList<Student>();
        lis.add(new Student(1001,"hada","男"));
        lis.add(new Student(1002,"haha","男"));
        lis.add(new Student(1003,"奇诺比可","女"));
        model.addAttribute("stuList",lis);
        return "stu/list";
    }
}
