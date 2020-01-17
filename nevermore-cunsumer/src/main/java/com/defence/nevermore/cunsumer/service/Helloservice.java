package com.defence.nevermore.cunsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description: java类作用描述
 * @Author:
 */
@FeignClient("nevermore-provider")
public interface Helloservice {

    @GetMapping("hello")
    public String hello(@RequestParam String name);
}
