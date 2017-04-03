package com.example.service;

import com.example.pojo.User;

import java.util.List;

/**
 * Created by qiyuefei on 2017/4/2.
 */
public interface IUserService {
    /**
     * 获取用户列表
     * @return
     */
    public List<User> getUserList();

    /**
     * 获取用户详情
     * @return
     */
    public User getUserDetail();
}
