package com.example.ribbonconsumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author liuyunkai
 * @Date 2019/10/28 0028
 * @Description
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String hello(){

        return restTemplate.getForEntity("http://eureka-provider/hello",String.class).getBody();
    }

    public String helloFallback() {

        return "error";
    }

}
