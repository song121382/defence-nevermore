package com.defence.nevermore.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NevoremoreAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(NevoremoreAuthApplication.class, args);
    }

}
