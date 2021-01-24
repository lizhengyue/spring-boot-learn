package com.example.demo.controller;

import com.example.demo.pojo.JSONResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("error")
public class ErrorController {

    @RequestMapping("index")
    public String index(){
        int a = 1/0;
        return "thymeleaf/index";
    }

    @RequestMapping("ajaxerror")
    public String ajaxError(){
        return "thymeleaf/ajaxerror";
    }


    @RequestMapping("getAjaxerror")
    @ResponseBody   //post请求必须要加这个 不然请求不到
    public JSONResult getAjaxError(){
       int a =1/0;
       return JSONResult.ok();
    }

}
