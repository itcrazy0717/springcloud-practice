package com.springcloud.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

/**
 * @author: dengxin.chen
 * @date: 2020-02-20 14:50
 * @description:
 */
@Configuration
public class config {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    /**
     * 实现其他方式的负载均衡
     * ribbon中共提供了7中负载均衡的算法
     *
     * @return
     */
    @Bean
    public IRule getRule() {

        return new RandomRule();
    }
}
