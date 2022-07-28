package com.his.controller;

import com.his.pojo.Department;
import com.his.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    /**
     * 所有部门列表
     * @return 所有部门列表
     */
    @RequestMapping("/allDepartment")
    public List<Department> getDepartmentList(){
        return departmentService.getDepartmentList();
    }

    /**
     * 通过部门代码删除部门
     * @param code
     * @return true-成功，false-失败
     */
    @RequestMapping("/deleteByCode")
    public boolean deleteDepartmentByCode(String code){
        return departmentService.deleteDepartment(code);
    }

    /**
     * 接收包含id的department对象，更新内容
     * @param department
     * @return true-成功，false-失败
     */
    @RequestMapping(value = "/updateDepartment",method = RequestMethod.POST)
    public boolean updateDepartmentById(@RequestBody Department department){
        return departmentService.updateDepartment(department);
    }

    /**
     * 添加科室
     * @param department
     * @return true-成功，false-失败
     */
    @RequestMapping(value = "addDepartment", method = RequestMethod.POST)
    public boolean addDepartment(@RequestBody Department department){
        return departmentService.addDepartment(department);
    }
}
