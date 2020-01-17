package com.defence.nevermore.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NevermoreProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(NevermoreProviderApplication.class, args);
    }

}
