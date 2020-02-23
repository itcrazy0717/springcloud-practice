package com.springcloud.zuulgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author: dengxin.chen
 * @date: 2020-02-23 13:17
 * @description: zuul网关示例
 */
@SpringBootApplication
// 添加zuul网关启动注解
@EnableZuulProxy
public class ZuulGateWay9527App {

    public static void main(String[] args) {
        SpringApplication.run(ZuulGateWay9527App.class, args);
    }
}
