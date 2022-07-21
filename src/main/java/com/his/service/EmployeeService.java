package com.his.service;

import com.his.pojo.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployeeList();
}
