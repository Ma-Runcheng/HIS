package com.his.service;

import com.his.pojo.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployeeList(int page, int pageSize);
    boolean deleteEmployeeById(int id);
    boolean updateEmployeeById(Employee employee);
}
