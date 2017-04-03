package com.example.controller;

import com.example.redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qiyuefei on 2017/4/2.
 */
@RestController
public class HelloController {
    @Autowired
    RedisService redisService;
    @RequestMapping("/hello")
    public String Say(){
        redisService.set("qi","yuefei");
        return redisService.get("qi").toString();
    }
}
