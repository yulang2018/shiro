package com.example.shiro.mapper;

import com.example.shiro.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Qualifier;

public interface UserMapper {
    User findByUserName(@Param("username") String username);
}
