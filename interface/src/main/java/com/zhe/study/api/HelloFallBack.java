package com.zhe.study.api;

/**
 * @author zhangzhe
 */
public class HelloFallBack implements HelloClient{

    @Override
    public String getHello() {
        return new String();
    }
}
