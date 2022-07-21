package com.his.controller;


import com.his.pojo.Employee;
import com.his.service.EmployeeService;
import com.his.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/allEmployee")
    public List<Employee> getEmployeeList(){
        return employeeService.getEmployeeList();
    }
}
