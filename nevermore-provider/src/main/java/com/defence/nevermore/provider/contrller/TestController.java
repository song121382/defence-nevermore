package com.defence.nevermore.provider.contrller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: java类作用描述
 * @Author:
 */
@RestController
public class TestController {
    @GetMapping("hello")
    public String str(String name) {
        return "hello" + name;
    }

}
