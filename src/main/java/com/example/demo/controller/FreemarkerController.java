package com.example.demo.controller;

import com.example.demo.pojo.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ftl")
public class FreemarkerController {
    @Autowired
    private Resource resource;

    @RequestMapping("index")
   // @RequestMapping("/index") 这个里面加不加“/” 其实没什么影响
    public String index(ModelMap map){
        map.addAttribute("resource",resource);
        map.addAttribute("lzy","nmb");
        return "freemarker/index";
    }

    @RequestMapping("center")
    public String center(){
        return "freemarker/center/center";
    }

}
