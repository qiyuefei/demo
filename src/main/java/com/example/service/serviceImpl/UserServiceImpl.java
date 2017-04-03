package com.example.service.serviceImpl;

import com.example.pojo.User;
import com.example.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by qiyuefei on 2017/4/2.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
//    @Resource
//    UserDao userDao;
    @Override
    public List<User> getUserList() {
        return null;
    }

    @Override
    public User getUserDetail() {

        return new User();
    }
}
