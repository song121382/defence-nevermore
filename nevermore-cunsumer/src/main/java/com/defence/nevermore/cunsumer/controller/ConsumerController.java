package com.defence.nevermore.cunsumer.controller;

import com.defence.nevermore.cunsumer.service.Helloservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: java类作用描述
 * @Author:
 */
@RestController
public class ConsumerController {

    @Autowired
    private Helloservice helloservice;

    @GetMapping
    public String sayHello(String name) {
        return helloservice.hello(name);
    }
}

