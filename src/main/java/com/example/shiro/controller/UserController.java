package com.example.shiro.controller;

import com.example.shiro.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findUserByUserName")
    public Object findUserByUserName(@Param("username")String username){
        return userService.findByUserName(username);
    }
}
