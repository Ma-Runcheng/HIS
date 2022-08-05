package com.his.mapper;


import com.his.pojo.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    /**
     * 查询用户，分页，与科室挂号级别进行表连接
     * @param start 起始
     * @param pageSize 每页个数，默认10个
     * @return 用户
     */
    @Results({
        @Result(property = "id", column = "id",id = true),
        @Result(property = "department", column = "deptment_id",
                one = @One(select = "com.his.mapper.DepartmentMapper.selectDepartmentById")),
        @Result(property = "registLevel", column = "regist_level_id",
                one = @One(select = "com.his.mapper.RegistLevelMapper.selectRegistLevelById")),
        @Result(property = "scheduling", column = "scheduling_id",
                one = @One(select = "com.his.mapper.SchedulingMapper.selectSchedulingById"))
    })
    @Select("select * from employee where delmark = 1 and realname like concat('%',#{name},'%') " +
            "LIMIT #{start},#{pageSize}")
    List<Employee> selectAllEmployeeAndDept(int start, int pageSize, String name);
    @Results({
            @Result(property = "id", column = "id",id = true),
            @Result(property = "department", column = "deptment_id",
                    one = @One(select = "com.his.mapper.DepartmentMapper.selectDepartmentById")),
            @Result(property = "registLevel", column = "regist_level_id",
                    one = @One(select = "com.his.mapper.RegistLevelMapper.selectRegistLevelById")),
            @Result(property = "scheduling", column = "scheduling_id",
                    one = @One(select = "com.his.mapper.SchedulingMapper.selectSchedulingById"))
    })
    @Select("select * from employee where deptment_id=#{deptmentId} and regist_level_id=#{registLevel}")
    List<Employee> selectAllEmployeeAndDepts(int deptmentId,int registLevel);
    /**
     * 删除用户，即delmark设置为0
     * @param id ID
     * @return true-成功，false-失败
     */
    @Update("update employee set delmark = 0 where id = #{id}")
    boolean deleteEmployeeById(int id);

    /**
     * 更新用户内容
     * @param employee 包含新信息的用户
     * @return true-成功，false-失败
     */
    @Update("update employee set deptment_id=#{deptmentId}, regist_level_id=#{registLevelId}," +
            "scheduling_id=#{schedulingId},realname=#{realname},password=#{password} where id = #{id}")
    boolean updateEmployee(Employee employee);

    /**
     * 添加
     * @param employee 新员工
     * @return true-成功，false-失败
     */
    @Insert("insert into employee (deptment_id,regist_level_id,scheduling_id,realname,password) " +
            "values (#{deptmentId},#{registLevelId},#{schedulingId},#{realname},#{password})")
    boolean insertEmployee(Employee employee);
}
