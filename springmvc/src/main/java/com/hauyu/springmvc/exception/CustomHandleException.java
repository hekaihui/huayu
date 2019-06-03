package com.hauyu.springmvc.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomHandleException implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
// 定义异常信息
       String msg="系统出错";
// 判断异常类型
        if(e instanceof MyExceptions){
            // 如果是自定义异常，读取异常信息
            MyExceptions myExceptions =(MyExceptions)e;
            msg=myExceptions.getMessage();
        }
        //打印错误信息
        e.printStackTrace();

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", msg);
        modelAndView.setViewName("in");
        return modelAndView;
    }

}
