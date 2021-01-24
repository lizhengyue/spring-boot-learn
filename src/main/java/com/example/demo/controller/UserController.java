package com.example.demo.controller;

import com.example.demo.pojo.JSONResult;
import com.example.demo.pojo.Resource;
import com.example.demo.pojo.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller()
@RestController // @Controller()+@ResponseBody
@RequestMapping("/user")
public class UserController {
    @Autowired
    Resource resource;
    @RequestMapping("/hello")
   // @ResponseBody
    public JSONResult hello(){
        User u = new User();
        u.setName("uuu");
        return JSONResult.ok(u);
    }

    @RequestMapping("/re")
    // @ResponseBody
    public JSONResult re(){

        return JSONResult.ok(resource.getName());
    }
}
