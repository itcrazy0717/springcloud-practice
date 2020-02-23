package com.springcloud.consumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.springcloud.consumer.rpc.FeignServiceClient;
import com.springcloud.domain.Dept;

/**
 * @author: dengxin.chen
 * @date: 2020-02-20 14:54
 * @description: 利用feign进行改造
 */
@RestController
@RequestMapping(value = "/consumer", produces = "application/json")
public class DeptConsumerController {

    @Autowired
    private FeignServiceClient serviceClient;


    @PostMapping(value = "/add")
    public Boolean add(Dept dept) {
        return serviceClient.add(dept);
    }

    @PostMapping(value = "/list")
    public List<Dept> deptList() {
        return serviceClient.list();
    }

    @PostMapping(value = "/get")
    public Dept get(Long id) {
        // 注意restTemplate传递单个参数的时候，需要进行封装，不然对端不能接收
        MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<>();
        paramMap.add("id", String.valueOf(id));
        return serviceClient.get(id);
    }
}
