package com.hauyu.springmvc.controller;

import com.hauyu.springmvc.bean.User;
import com.hauyu.springmvc.service.loginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class loginController {
    @Resource(name = "loginService")
    private loginService loginService;

    public com.hauyu.springmvc.service.loginService getLoginService() {
        return loginService;
    }

    public void setLoginService(com.hauyu.springmvc.service.loginService loginService) {
        this.loginService = loginService;
    }

    @RequestMapping(value = "/login.stu")
    public String login(HttpSession session, User user){
        //判断登录是否成功，成功到主页 ，否是返回登录
     /*  if(indent!=null && indent.getTime().equals("121")){
           System.out.println(indent.getTime()+"-----------------");
            session.setAttribute("ind",indent);
       }else {
           return "/login";
       }*/
     /*if(  loginService.select(user)==null){
         ModelAndView modelAndView =new ModelAndView();
         modelAndView.addObject("")
     }*/
      loginService.select(user);
        session.setAttribute("ind",user);


        return "redirect:list.stu";
    }
}
