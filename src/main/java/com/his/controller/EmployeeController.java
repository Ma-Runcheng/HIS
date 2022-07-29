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

    @RequestMapping("/allEmployee")
    public List<Employee> getEmployeeList(@RequestParam(defaultValue = "1" ) Integer page,
                                          @RequestParam(defaultValue = "10") Integer pageSize){
        return employeeService.getEmployeeList(page,pageSize);
    }

    /**
     *
     * @param id
     * @return
     */
    @RequestMapping("/deleteById")
    public boolean deleteEmployee(int id){
        return employeeService.deleteEmployeeById(id);
    }

    @RequestMapping("/updateEmployee")
    public boolean updateEmployee(@RequestBody Employee employee){
        System.out.println(employee);
        return employeeService.updateEmployeeById(employee);
    }
}
