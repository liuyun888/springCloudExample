package com.example.eurekaprovider2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
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

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/hello")
    public String hello(){

        logger.info("eureka-provider2 hello");

        return "hello";
    }

}
