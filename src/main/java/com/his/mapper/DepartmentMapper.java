package com.his.mapper;

import com.his.pojo.Department;
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

    /**
     * 通过部门代码删除
     * @param code
     * @return true-成功，false-失败
     */
    @Update("update department set delmark = 0 where dept_code = #{code}")
    boolean deleteDepartmentByCode(String code);

    @Update("update department set dept_code = #{deptCode} ," +
            "dept_name=#{deptName}," +
            "dept_type=#{deptType} where id = #{id}")
    boolean updateDepartmentById(Department department);
}
