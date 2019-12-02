package com.example.feignconsumer.controller;

import com.example.feignconsumer.service.RefactorHelloService;
import com.example.serviceapi.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author liuyunkai
 * @Date 2019/10/30 0030
 * @Description
 */
@RestController
@RequestMapping(value = "/feign-consumer")
public class ConsumerController {
//    @Autowired
//    HelloService helloService;

    @Autowired
    RefactorHelloService refactorHelloService;
//
//    @RequestMapping(value = "/feign-consumer")
//    public String helloConsumer() {
//
//        return helloService.sayHello();
//    }


    @RequestMapping(value = "/helloConsumer1")
    public String helloConsumer1() {
        StringBuilder sb = new StringBuilder();
        sb.append(refactorHelloService.hello(" mimi")).append("\r\n");
        sb.append(refactorHelloService.hello("lk",26)).append("\r\n");
        sb.append(refactorHelloService.hello(new User(" jh",25))).append("\r\n");

        return sb.toString();

    }


}
