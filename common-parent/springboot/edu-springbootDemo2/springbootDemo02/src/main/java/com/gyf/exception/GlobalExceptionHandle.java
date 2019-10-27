package com.gyf.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice//控制器切面
public class GlobalExceptionHandle {
//    @ExceptionHandler(RuntimeException.class)//捕获运行时异常
//    @ResponseBody//返回json数据
//    //处理异常方法
//    public Map<String,Object> excepetionRun(){
//        Map<String,Object> map=new HashMap<>();
//        map.put("errorCode",100);
//        map.put("errorMsg","系统错误");
//        return map;
//    }
}
