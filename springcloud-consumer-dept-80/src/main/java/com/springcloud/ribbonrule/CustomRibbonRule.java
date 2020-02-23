package com.springcloud.ribbonrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;

/**
 * @author: dengxin.chen
 * @date: 2020-02-21 15:25
 * @description:
 */
@Configuration
public class CustomRibbonRule {

    @Bean
    public IRule getRule() {
        return new CustomRule();
    }
}
