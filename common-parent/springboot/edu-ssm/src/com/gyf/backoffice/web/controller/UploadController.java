package com.gyf.backoffice.web.controller;


import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.UUID;

@Controller
@RequestMapping("upload")
public class UploadController {
    //    这个方法是用来上传图片
    @RequestMapping("itemspic")
    public void itemspic(HttpServletRequest request,HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        //获取图片
        MultipartHttpServletRequest multipartHttpServletRequest= (MultipartHttpServletRequest) request;
        MultipartFile mfile = multipartHttpServletRequest.getFile("itemspic1");
//保存图片
        //常见文件夹保存图片
        String fileFloder=request.getServletContext().getRealPath("/upload");
        System.out.println(fileFloder);
        System.out.println("文件路径过来了 ");
        File filefloder=new File(fileFloder);
        if(!filefloder.exists()){
            filefloder.mkdir();
        }
        //保存图片
        String suffix=mfile.getOriginalFilename().split("\\.")[1];
        String fileName= UUID.randomUUID().toString().replace("-","")+"."+suffix;
        String totalPath=fileFloder+"\\"+fileName;
        System.out.println("totalPath"+totalPath);
        FileCopyUtils.copy(mfile.getInputStream(),new FileOutputStream(new File(totalPath)));

        //返回数据给前台
        String imgurl="http://localhost:8080/upload/"+fileName;
        String responseJson="{\"imgurl\":\""+imgurl+"\"}";
        response.setHeader("content-type","text/json;charset=utf-8");
        response.getWriter().write(responseJson);
    }
}
