package com.live;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class StringcloudZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(StringcloudZuulApplication.class, args);
    }

}
