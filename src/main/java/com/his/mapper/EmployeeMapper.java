package com.his.mapper;


import com.his.pojo.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    /**
     *
     * @param start
     * @param pageSize
     * @return
     */
    @Results({
        @Result(property = "id", column = "id",id = true),
        @Result(property = "department", column = "deptment_id",
                one = @One(select = "com.his.mapper.DepartmentMapper.selectDepartmentById")),
        @Result(property = "registLevel", column = "regist_level_id",
                one = @One(select = "com.his.mapper.RegistLevelMapper.selectRegistLevelById"))
    })
    @Select("select * from employee LIMIT #{start},#{pageSize}")
    List<Employee> selectAllEmployeeAndDept(int start, int pageSize);

    /**
     *
     * @param id
     * @return
     */
    @Delete("update employee set delmark = 0 where id = #{id}")
    boolean deleteEmployeeById(int id);

    /**
     *
     * @param employee
     * @return
     */
    @Update("update employee set deptment_id=#{deptmentId}, regist_level_id=#{registLevelId}," +
            "scheduling_id=#{schedulingId},realname=#{realname},password=#{password} where id = #{id}")
    boolean updateEmployee(Employee employee);
}
