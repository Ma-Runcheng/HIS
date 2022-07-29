package com.his.service.impl;

import com.his.mapper.EmployeeMapper;
import com.his.pojo.Employee;
import com.his.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    /**
     *
     * @param page
     * @param pageSize
     * @return
     */
    @Override
    public List<Employee> getEmployeeList(int page, int pageSize) {
        int start = (page - 1) * pageSize;
        return employeeMapper.selectAllEmployeeAndDept(start,pageSize);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public boolean deleteEmployeeById(int id) {
        return employeeMapper.deleteEmployeeById(id);
    }

    /**
     * @param employee
     * @return
     */
    @Override
    public boolean updateEmployeeById(Employee employee) {
        return employeeMapper.updateEmployee(employee);
    }
}
