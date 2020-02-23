package com.springcloud.dept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.dept.service.DeptService;
import com.springcloud.domain.Dept;

/**
 * @author: dengxin.chen
 * @date: 2020-02-20 13:12
 * @description:
 */
@RestController
@RequestMapping(value = "/dept", produces = "application/json")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @Autowired
    private DiscoveryClient discoveryClient;


    @PostMapping("/add")
    public boolean add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }

    @PostMapping("/get")
    public Dept get(Long id) {
        return deptService.get(id);
    }

    @PostMapping(value = "/list")
    private List<Dept> list() {
        return deptService.list();
    }
    
    @PostMapping(value = "/discover/client")
    private Object clientInfo() {
        List<String> services = discoveryClient.getServices();
        System.out.println(services);
        List<ServiceInstance> instances = discoveryClient.getInstances("SPRINGCLOUD-DEPT");

        for (ServiceInstance instance : instances) {

            System.out.println(instance.getServiceId()
                               + " " + instance.getHost()
                               + " " + instance.getPort()
                               + " " + instance.getUri());

        }
        return this.discoveryClient;
    }
}
