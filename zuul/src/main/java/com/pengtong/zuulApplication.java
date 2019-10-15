package com.pengtong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableAutoConfiguration
public class zuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(zuulApplication.class, args);
    }

}
