package com.springcloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.springcloud.ribbonrule.CustomRibbonRule;

/**
 * @author: dengxin.chen
 * @date: 2020-02-20 14:55
 * @description:
 */
@SpringBootApplication
@EnableEurekaClient
// 使用自定义轮询算法
@RibbonClient(name = "SPRINGCLOUD-DEPT", configuration = CustomRibbonRule.class)
public class DeptConsumer80App {

    public static void main(String[] args) {

        SpringApplication.run(DeptConsumer80App.class, args);
    }

}
