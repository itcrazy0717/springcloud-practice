package com.springcloud.dept.service.impl;

import java.util.List;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcloud.dept.dao.DeptDao;
import com.springcloud.dept.service.DeptService;
import com.springcloud.domain.Dept;

/**
 * @author: dengxin.chen
 * @date: 2020-02-20 13:10
 * @description:
 */

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public Boolean add(Dept dept) {
        if (Objects.isNull(dept)) {
            return false;
        }
        if (StringUtils.isEmpty(dept.getName())) {
            return false;
        }
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        if (Objects.isNull(id) || id < 0) {
            return new Dept();
        }
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}
