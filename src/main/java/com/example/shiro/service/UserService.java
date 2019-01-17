package com.example.shiro.service;

import com.example.shiro.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    User findByUserName(String username);
}
