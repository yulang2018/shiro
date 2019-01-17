package com.example.shiro.service.serviceImpl;

import com.example.shiro.mapper.UserMapper;
import com.example.shiro.model.User;
import com.example.shiro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByUserName(String username) {
        return userMapper.findByUserName(username);
    }
}
