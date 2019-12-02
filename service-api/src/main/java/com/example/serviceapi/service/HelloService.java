package com.example.serviceapi.service;

import com.example.serviceapi.dto.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author liuyunkai
 * @Date 2019/10/30 0030
 * @Description
 */
@RequestMapping("/refactor")
public interface HelloService {

    @RequestMapping(value = "/hello4")
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/hello5")
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "/hello6")
    String hello(@RequestBody User user);
}
