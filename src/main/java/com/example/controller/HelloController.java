package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qiyuefei on 2017/4/2.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String Say(){
        return  "hello spring boot";
    }
}
