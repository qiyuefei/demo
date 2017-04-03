package com.example.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by qiyuefei on 2017/4/2.
 */

@Repository
public interface UserDao {
    /**
     * 获取用户列表
     * @return
     */
    List<Object> getUserList();

    /**
     * 获取用户详情
     * @return
     */
    Object getUserDetail();
}
