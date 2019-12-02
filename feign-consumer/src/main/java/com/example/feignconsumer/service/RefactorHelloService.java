package com.example.feignconsumer.service;

import com.example.serviceapi.service.HelloService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author liuyunkai
 * @Date 2019/10/30 0030
 * @Description
 */
@FeignClient(value = "eureka-provider")
public interface RefactorHelloService extends HelloService {
}
