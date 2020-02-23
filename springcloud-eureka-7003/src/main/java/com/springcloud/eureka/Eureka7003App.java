package com.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: dengxin.chen
 * @date: 2020-02-20 20:34
 * @description:
 */
@SpringBootApplication
// 注意在主启动类上必须加上启动Eureka的注解
// EurekaServer服务器端启动类,接受其它微服务注册进来
@EnableEurekaServer
public class Eureka7003App {

    public static void main(String[] args) {
        SpringApplication.run(Eureka7003App.class, args);
    }
}
