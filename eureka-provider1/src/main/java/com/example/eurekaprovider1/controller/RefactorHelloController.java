package com.example.eurekaprovider1.controller;

import com.example.serviceapi.dto.User;
import com.example.serviceapi.service.HelloService;
import org.springframework.web.bind.annotation.*;

/**
 * @Author liuyunkai
 * @Date 2019/10/30 0030
 * @Description
 */
@RestController
public class RefactorHelloController implements HelloService {

    @Override
    public String hello(@RequestParam("name") String name){

        return "Hello" + name;
    }

    @Override
    public User hello(@RequestHeader("name") String name,@RequestHeader("age") Integer age) {
        return new User(name,age);
    }

    @Override
    public String hello(@RequestBody User user) {
        return "Hello" + user.getName()+","+user.getName();
    }

}
