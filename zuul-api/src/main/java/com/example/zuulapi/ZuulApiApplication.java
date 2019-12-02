package com.example.zuulapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Administrator
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ZuulApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApiApplication.class, args);
    }

}
