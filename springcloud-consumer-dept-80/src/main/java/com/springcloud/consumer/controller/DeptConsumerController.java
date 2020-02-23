package com.springcloud.consumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.springcloud.domain.Dept;

/**
 * @author: dengxin.chen
 * @date: 2020-02-20 14:54
 * @description:
 */
@RestController
@RequestMapping(value = "/consumer", produces = "application/json")
public class DeptConsumerController {

//    private static final String HOST_URL = "http://localhost:8001";
    // 从eureka上获得provider的url，此时加入了ribbon进行负载均衡
    private static final String HOST_URL = "http://SPRINGCLOUD-DEPT";
    @Autowired
    private RestTemplate restTemplate;


    @PostMapping(value = "/add")
    public Boolean add(Dept dept) {
        return restTemplate.postForObject(HOST_URL + "/dept/add", dept, Boolean.class);
    }

    @PostMapping(value = "/list")
    public List<Dept> deptList() {
        return restTemplate.postForObject(HOST_URL + "/dept/list", null, List.class);
    }

    @PostMapping(value = "/get")
    public Dept get(Long id) {
        // 注意restTemplate传递单个参数的时候，需要进行封装，不然对端不能接收
        MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<>();
        paramMap.add("id", String.valueOf(id));
        return restTemplate.postForObject(HOST_URL + "/dept/get", paramMap, Dept.class);
    }
}
