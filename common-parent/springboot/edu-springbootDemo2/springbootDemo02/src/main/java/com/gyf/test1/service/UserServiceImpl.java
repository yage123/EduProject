package com.gyf.test1.service;

import com.gyf.model.User;
import com.gyf.test1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {
    @Autowired
    private UserMapper userMapper;
    public void register(String username,String password){
        userMapper.save(username,password);
    }
    public User find(String username){
        return userMapper.fingByUsername(username);
    }
}
