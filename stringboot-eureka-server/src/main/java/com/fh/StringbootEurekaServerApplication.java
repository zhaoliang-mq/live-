package com.fh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class StringbootEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StringbootEurekaServerApplication.class, args);
    }

}
