package com.example.eurekaprovider1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * @Author liuyunkai
 * @Date 2019/10/27 0027
 * @Description
 */
@RestController
@RequestMapping(value = "/eureka-provider")
public class HelloController {
    private final Logger logger = Logger.getLogger(String.valueOf(getClass()));

    @GetMapping(value = "/hello")
    public String hello(){
        logger.info("eureka-provider1 hello");

        return "hello";
    }

}
