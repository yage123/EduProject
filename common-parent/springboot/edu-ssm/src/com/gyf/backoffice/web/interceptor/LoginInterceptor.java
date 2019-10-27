package com.gyf.backoffice.web.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    //controller执行这个拦截方法
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
//        拦截
//        排除不需要拦截的路径
        System.out.println("当前访问的url"+httpServletRequest.getRequestURI());
        if(httpServletRequest.getRequestURI().endsWith("login.do")){
            return true;//放行
        }
//如果已经登录了也要放行
        if(httpServletRequest.getSession().getAttribute("username")!=null){
            return  true;
        }
//进入到login界面
        httpServletRequest.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(httpServletRequest,httpServletResponse);

        return false;
    }

//controller执行后返回true未返回视图前用这个方法
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("未返回视图   de处理");
    }

    //controller执行后true返回视图后用这个方法
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("返回视图    de处理");
    }
}
