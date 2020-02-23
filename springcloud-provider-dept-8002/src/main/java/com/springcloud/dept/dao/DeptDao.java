package com.springcloud.dept.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.springcloud.domain.Dept;

/**
 * @author: dengxin.chen
 * @date: 2020-02-20 13:01
 * @description:
 */
@Mapper
public interface DeptDao {

    Boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();
}
