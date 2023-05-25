package com.zgl.service;

import com.zgl.entity.User;
import com.zgl.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public List<User> querAll(){
        return userMapper.queryAll();
    }
    public int addUser(User user){
        return userMapper.addUser(user);
    }
    public int deleteUser(int id){
        return userMapper.deleteUser(id);
    }
}
