package com.springcloud.consumer.rpc;

import java.util.List;

import org.springframework.stereotype.Component;

import com.springcloud.domain.Dept;

import feign.hystrix.FallbackFactory;

/**
 * @author: dengxin.chen
 * @date: 2020-02-22 21:02
 * @description:
 */
@Component
public class DeptServiceFallback implements FallbackFactory<FeignServiceClient> {

    @Override
    public FeignServiceClient create(Throwable throwable) {
        return new FeignServiceClient() {

            @Override
            public Boolean add(Dept dept) {
                return null;
            }

            @Override
            public Dept get(Long id) {
                return new Dept().setId(id)
                                 .setName("没有该数据")
                                 .setDbSource("数据源未知");
            }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
