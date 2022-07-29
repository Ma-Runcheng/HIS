package com.his.service.impl;

import com.his.mapper.DepartmentMapper;
import com.his.pojo.Department;
import com.his.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;

    /**
     * 科室查询
     * @return Department
     */
    @Override
    public List<Department> getDepartmentList() {
        return departmentMapper.selectAllDepartment();
    }

    /**
     * 通过部门代号删除某部门，即将delmark置0
     * @return true-成功，false-失败
     */
    @Override
    public boolean deleteDepartment(String code) {
        return departmentMapper.deleteDepartmentByCode(code);
    }

    /**
     * 接收包含id的department对象，更新内容
     * @param newDepartment
     * @return true-成功，false-失败
     */
    @Override
    public boolean updateDepartment(Department newDepartment) {
        return departmentMapper.updateDepartmentById(newDepartment);
    }

    /**
     * 添加科室
     * @param newDepartment
     * @return true-成功，false-失败
     */
    @Override
    public boolean addDepartment(Department newDepartment) {
        return departmentMapper.insertDepartment(newDepartment);
    }
}
