package com.atguigu.springboot.controller;

import com.atguigu.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomizeHelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/cusHello")
    public String hello(){
        return helloService.sayHelloAtguigu("haha");
    }

}
