package com.hauyu.springmvc.controller;

import com.hauyu.springmvc.bean.Indents;
import com.hauyu.springmvc.exception.MyExceptions;
import com.hauyu.springmvc.service.InService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

@Controller
public class Stu {

    @Resource(name = "inService")
    private InService inService;


    public void setInService(InService inService) {
        this.inService = inService;
    }


          @RequestMapping(value = "/list.stu")
     //查询所有
    // @RequestMapping("item/{id}")
     //@ResponseBody
    public String queryall(Model model) throws Exception {
         model.addAttribute("list",inService.select());
        return "/select";
    }

    //@RequestMapping(value = "/querry.stu")
    //查询一条
  @RequestMapping("hehe/{id}.stu" )
    public String queryall1(Model model,@PathVariable(name = "id") String indentid) throws Exception {
         model.addAttribute("list",inService.select1(indentid));
        return "/update";
    }

    //@RequestMapping(value = "/save.stu")
    //添加
 @RequestMapping(value = "hehe.stu",method = RequestMethod.POST)
    public  String  save(@Validated Indents indents, BindingResult bindingResult, Model model) throws Exception {
        List<ObjectError> list =bindingResult.getAllErrors();
        if(list.size()>0){
            model.addAttribute("errors",list);
            return "/insert";
        }else {
            inService.save(indents);
        }
        return "redirect:list.stu";
        //重定向
    }

    @RequestMapping(value = "/delete.stu")
    //删除
    public  String delete(Indents indents) throws IOException, MyExceptions {
        inService.delete(indents);
        return "redirect:list.stu";
    }

    @RequestMapping(value = "/update.stu")
     //修改
    public String update (Indents indents) throws MyExceptions, IOException {
        inService.update(indents);
        return "redirect:list.stu";
    }


}