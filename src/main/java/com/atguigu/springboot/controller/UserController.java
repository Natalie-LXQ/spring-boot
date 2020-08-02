package com.atguigu.springboot.controller;

import com.atguigu.springboot.entity.User;
import com.atguigu.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/userJpa/{id}")
    public User getUser(@PathVariable("id") Integer id){
        User user = userRepository.findById(id).orElse(null);
        return user;
    }

    @GetMapping("/userJpa")
    public User insertUser(User user){
        User userSave = userRepository.save(user);
        return userSave;
    }

}
