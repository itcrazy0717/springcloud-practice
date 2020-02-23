package com.springcloud.dept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

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
// 注意，这里有一个坑，如果只在方法上做熔断，则所有方法都需要加上@HystrixCommand，不然其他方法中的对象得不到注入
@EnableCircuitBreaker
public class DeptProvider8004App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8004App.class, args);
    }
}
