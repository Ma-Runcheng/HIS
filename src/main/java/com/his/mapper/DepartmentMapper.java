package com.his.mapper;

import com.his.pojo.Department;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import java.util.List;

@Mapper
public interface DepartmentMapper {

    /**
     * 查询存在的所有部门
     * @return 所有部门json数组
     */
    @Select("select * from department where delmark = 1")
    List<Department> selectAllDepartment();

    @Select("select * from department where id = #{id}")
    Department selectDepartmentById(int id);

    /**
     * 通过dept_code删除
     * @param code
     * @return true-成功，false-失败
     */
    @Update("update department set delmark = 0 where dept_code = #{code}")
    boolean deleteDepartmentByCode(String code);

    /**
     * 通过id更新
     * @param department
     * @return true-成功，false-失败
     */
    @Update("update department set dept_code = #{deptCode} ," +
            "dept_name=#{deptName}," +
            "dept_type=#{deptType} where id = #{id}")
    boolean updateDepartmentById(Department department);

    /**
     * 添加新科室
     * @param department
     * @return true-成功，false-失败
     */
    @Insert("insert into department (dept_code,dept_name,dept_type) values (#{deptCode},#{deptName},#{deptType})")
    boolean insertDepartment(Department department);
}
