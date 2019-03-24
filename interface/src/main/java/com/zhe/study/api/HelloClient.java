package com.zhe.study.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhangzhe
 */
@FeignClient(value = "service", configuration = HellConfig.class, fallback = HelloFallBack.class)
public interface HelloClient {

    @GetMapping("/service/getHello")
    public String getHello();

}
