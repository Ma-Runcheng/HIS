package com.his.controller;


import com.his.pojo.Employee;
import com.his.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * 所有用户
     *
     * @param page     页数
     * @param pageSize 每页项数
     * @param name     模糊查询名字
     * @return 10个用户
     */
    @RequestMapping("/allEmployee")
    public List<Employee> getEmployeeList(@RequestParam(defaultValue = "1") Integer page,
                                          @RequestParam(defaultValue = "10") Integer pageSize,
                                          @RequestParam(defaultValue = "") String name) {
        return employeeService.getEmployeeList(page, pageSize, name);
    }

    /**
     * 查询所有的医生
     */
    @RequestMapping("/allEmployees")
    public List<Employee> getEmployeeLists(@RequestParam(value = "deptmentId") int deptmentId, @RequestParam(value = "registLevelId") int registLevelId) {
        return employeeService.getEmployeeLists(deptmentId, registLevelId);
    }

    /**
     * 删除
     *
     * @param id ID
     * @return true-成功，false-失败
     */
    @RequestMapping("/deleteRegisterById")
    public boolean deleteEmployee(int id) {
        return employeeService.deleteEmployeeById(id);
    }

    /**
     * 更新
     *
     * @param employee 新员工
     * @return true-成功，false-失败
     */
    @RequestMapping(value = "/updateEmployee", method = RequestMethod.POST)
    public boolean updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmployeeById(employee);
    }

    /**
     * 添加新员工
     *
     * @param employee 新员工
     * @return true-成功，false-失败
     */
    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public boolean addEmployee(@RequestBody Employee employee) {
        return employeeService.insertEmployee(employee);
    }
}
