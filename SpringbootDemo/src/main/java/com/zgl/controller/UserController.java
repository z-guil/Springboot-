package com.zgl.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zgl.entity.User;
import com.zgl.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    UserService userService;
    @Resource
    ObjectMapper mapper;


    @GetMapping("/all")
    public String queryAll() throws JsonProcessingException {
        String json = mapper.writeValueAsString(userService.querAll());
        return json;
    }

    @PostMapping("/add")
    public int addUser(@RequestParam("age") int age, @RequestParam("name") String name, @RequestParam("pwd") String pwd){
        User user = new User(age,name,pwd);
        return userService.addUser(user);
    }

    @GetMapping("/delete/{id}")
    public int deleteUser(@PathVariable("id") int id){
        return userService.deleteUser(id);
    }

}
