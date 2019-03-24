package com.zhe.study.client.controller;

import com.zhe.study.api.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangzhe
 */
@RestController
@RequestMapping("/client")
public class TestController {

    @Autowired
    private HelloClient helloClient;


    @GetMapping("/getStr")
    public String getStr() {
        return "hello client";
    }

    @GetMapping("/hello")
    public String get() {
        return helloClient.getHello();
    }

    @PostMapping("/post")
    public String post() {
        return helloClient.getHello();
    }
}
