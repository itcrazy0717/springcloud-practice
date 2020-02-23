package com.springcloud.consumer.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author: dengxin.chen
 * @date: 2020-02-22 22:01
 * @description:
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DashBoard9001App {

    public static void main(String[] args) {
        SpringApplication.run(DashBoard9001App.class, args);
    }
}
