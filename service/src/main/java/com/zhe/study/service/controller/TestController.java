package com.zhe.study.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;

/**
 * @author zhangzhe
 */
@RestController
@RequestMapping("/service")
public class TestController {

    @GetMapping("/getStr")
    public String getStr() {
        return "hello";
    }

    @GetMapping("/getHello")
    public String getHello() {
        try {
            Thread.sleep(400);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return "hello feign";
    }

}
