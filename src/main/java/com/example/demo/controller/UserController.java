package com.example.demo.controller;

import com.example.demo.pojo.JSONResult;
import com.example.demo.pojo.Resource;
import com.example.demo.pojo.SysUser;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.n3r.idworker.Id;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;


@RestController // @Controller()+@ResponseBody
@RequestMapping("/user")
public class UserController {
    @Autowired
    Resource resource;
    @Autowired
    private UserService userService;

    @Autowired
    private Sid sid;


    @RequestMapping("/hello")
   // @ResponseBody
    public JSONResult hello(){
        User u = new User();
        u.setName("uuu");
        return JSONResult.ok(u);
    }

    @RequestMapping("/re")
    public JSONResult re(){

        return JSONResult.ok(resource.getName());
    }

    @RequestMapping("/list")
    public JSONResult list(){
        return JSONResult.ok(userService.queryList());
    }

    @RequestMapping("/save")
    public JSONResult save() throws Exception {
        SysUser sysUser = new SysUser();
        sysUser.setId(Id.next());
        sysUser.setName("lzy");
        sysUser.setPassword("lzy123");
        sysUser.setEmail("213");
        sysUser.setCreateTime(new Date());
        userService.saveUser(sysUser);
        return JSONResult.ok();
    }

    @RequestMapping("/update")
    public JSONResult update(){
        SysUser sysUser = new SysUser();
        sysUser.setId((long)2);
        sysUser.setName("88888");
        userService.update(sysUser);
        return JSONResult.ok();
    }

    @RequestMapping("/page")
    public JSONResult page(Integer page){
        if (page == null) {
            page = 1;
        }
        int pageSize = 2;
        SysUser sysUser = new SysUser();
        List<SysUser> sysUsers = userService.queryListPage(sysUser, page, pageSize);
        return JSONResult.ok(sysUsers);
    }

    @RequestMapping("/customer")
    public JSONResult customer(String id){
        List<SysUser> sysUsers = userService.queryCustomer(id);
        return JSONResult.ok(sysUsers);
    }

    @RequestMapping("/tans")
    public JSONResult tans(){
        userService.saveLzy();
        return JSONResult.ok();
    }

    @RequestMapping("/delete")
    public JSONResult delete(String id){
        userService.deleteById(id);
        return  JSONResult.ok();
    }
}
