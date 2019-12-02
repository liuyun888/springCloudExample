package com.example.feignconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author liuyunkai
 * @Date 2019/10/30 0030
 * @Description
 */
//@FeignClient("eureka-provider")
public interface HelloService {

    @RequestMapping("/hello")
    String sayHello();
}
