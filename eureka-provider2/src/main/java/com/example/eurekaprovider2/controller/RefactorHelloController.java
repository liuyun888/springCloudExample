package com.example.eurekaprovider2.controller;

import com.example.serviceapi.dto.User;
import com.example.serviceapi.service.HelloService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author liuyunkai
 * @Date 2019/10/30 0030
 * @Description
 */
@RestController
public class RefactorHelloController implements HelloService {
    @Override
    public String hello(String name) {
        return "Hello" + name;
    }

    @Override
    public User hello(String name, Integer age) {
        return new User(name,age);
    }

    @Override
    public String hello(User user) {
        return "Hello" + user.getName()+","+user.getName();
    }
}
