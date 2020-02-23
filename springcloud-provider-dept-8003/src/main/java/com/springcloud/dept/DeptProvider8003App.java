package com.springcloud.dept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: dengxin.chen
 * @date: 2020-02-20 13:16
 * @description:
 */
@SpringBootApplication
// 将provider注册进eureka中
@EnableEurekaClient
// 服务发现启动
@EnableDiscoveryClient
public class DeptProvider8003App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8003App.class, args);
    }
}
