package com.example.demo.controller;

import com.example.demo.pojo.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("redis")
public class RedisController {

    @Autowired
    private StringRedisTemplate stRedis;
    @RequestMapping("test")
    public JSONResult test(){
       stRedis.opsForValue().set("lzy-cache","hello");
       return JSONResult.ok( stRedis.opsForValue().get("lzy-cache"));
    }
}
