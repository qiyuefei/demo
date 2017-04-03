package com.example.controller;

import com.example.pojo.User;
import com.example.service.IUserService;
import com.example.entity.ResponseMessage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by qiyuefei on 2017/4/2.
 */
@RestController
public class UserController {
    @Resource
    IUserService userService;

    @RequestMapping("/getUserList")
    public Object getUserList(){
        List<User> userList = userService.getUserList();
        return  new ResponseMessage().success("查询成功",userList);
    }

    @RequestMapping("/getUserDetail")
    public Object getUser(){
        User user = userService.getUserDetail();
        return  new ResponseMessage().success("查询成功",user);
    }
}
