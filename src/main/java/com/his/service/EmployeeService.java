package com.his.service;

import com.his.pojo.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployeeList(int page, int pageSize, String name);
    boolean deleteEmployeeById(int id);
    boolean updateEmployeeById(Employee employee);
    boolean insertEmployee(Employee employee);

    List<Employee> getEmployeeLists(int deptmentId,int registLevelId);
}
