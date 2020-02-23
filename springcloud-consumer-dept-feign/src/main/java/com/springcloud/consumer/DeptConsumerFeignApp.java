package com.springcloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author: dengxin.chen
 * @date: 2020-02-20 14:55
 * @description:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.springcloud.consumer"})
public class DeptConsumerFeignApp {

    public static void main(String[] args) {

        SpringApplication.run(DeptConsumerFeignApp.class, args);
    }

}
