package com.his.mapper;


import com.his.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    /**
     * 查询所有员工
     * @return 返回所有员工json数组
     */
    @Select("select * from employee")
    List<Employee> selectAllEmployee();
}
