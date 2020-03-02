package com.springcloud.consumer.rpc;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springcloud.domain.Dept;

/**
 * @author: dengxin.chen
 * @date: 2020-02-21 16:10
 * @description: 由于使用了feign，因此这里其实可以提到api中去，通过eureka进行访问
 */
@FeignClient(value = "SPRINGCLOUD-DEPT", fallbackFactory = DeptServiceFallback.class)
public interface FeignServiceClient {


    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    Boolean add(Dept dept);

    @RequestMapping(value = "/dept/get", method = RequestMethod.POST)
    // 注意feign请求的时候如果是单个参数需用@RequestParam进行修饰，不是用springmvc的参数绑定形式
    Dept get(@RequestParam("id") Long id);

    @RequestMapping(value = "/dept/list", method = RequestMethod.POST)
    List<Dept> list();

}
