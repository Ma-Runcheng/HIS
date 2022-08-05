package com.his.service.impl;

import com.his.mapper.EmployeeMapper;
import com.his.pojo.Employee;
import com.his.pojo.Scheduling;
import com.his.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    /**
     * 所有用户
     * @param page 页数
     * @param pageSize 每个个数
     * @return 10个用户
     */
    @Override
    public List<Employee> getEmployeeList(int page, int pageSize, String name) {
        int start = (page - 1) * pageSize;
        return employeeMapper.selectAllEmployeeAndDept(start,pageSize,name);
    }

    @Override
    public List<Employee> getEmployeeLists(int deptmentId,int registLevelId) {
//        int start = (page - 1) * pageSize;
        return employeeMapper.selectAllEmployeeAndDepts(deptmentId,registLevelId);
    }
    /**
     * 删除
     * @param id ID
     * @return true-成功，false-失败
     */
    @Override
    public boolean deleteEmployeeById(int id) {
        return employeeMapper.deleteEmployeeById(id);
    }

    /**
     * 更新
     * @param employee 员工信息
     * @return true-成功，false-失败
     */
    @Override
    public boolean updateEmployeeById(Employee employee) {
        return employeeMapper.updateEmployee(employee);
    }

    /**
     * 添加
     * @param employee 新员工
     * @return true-成功，false-失败
     */
    @Override
    public boolean insertEmployee(Employee employee) {
        return employeeMapper.insertEmployee(employee);
    }
}
