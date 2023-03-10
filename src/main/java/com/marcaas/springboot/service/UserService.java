package com.marcaas.springboot.service;

import com.marcaas.springboot.entity.User;
import com.marcaas.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public Integer save(User user) {
        if (user.getId() == null) { // user没有id，则表示是新增
            return userMapper.insert(user);
        }
        else {
            return userMapper.update(user);
        }
    }
}
