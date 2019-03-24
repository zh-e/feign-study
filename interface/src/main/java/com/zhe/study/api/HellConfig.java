package com.zhe.study.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangzhe
 */
@Configuration
public class HellConfig {

    @Bean
    public HelloFallBack helloFallBack() {
        return new HelloFallBack();
    }

}
