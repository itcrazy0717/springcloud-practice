package com.springcloud.dept.service;

import java.util.List;

import com.springcloud.domain.Dept;

/**
 * @author: dengxin.chen
 * @date: 2020-02-20 13:09
 * @description:
 */
public interface DeptService {

    Boolean add(Dept dept);

    Dept get(Long id);

    List<Dept> list();
}
