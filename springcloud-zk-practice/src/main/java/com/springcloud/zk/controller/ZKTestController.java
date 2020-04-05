package com.springcloud.zk.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: dengxin.chen
 * @date: 2020-04-05 20:49
 * @description:
 */
@RestController
// 注意这里需要加上@RefreshScope注解，然后zk上的配置改变后，此处的值才会改变
@RefreshScope
public class ZKTestController {

    @Value("${zk.test.config}")
    private String testValue;

    /**
     * 从zk上获取配置，如果成功，则返回 i am zk config，否则返回 123
     *
     * @return
     */
    @PostMapping("/zk/getConfig")
    public String getZKConfig() {
        return testValue;
    }
}
