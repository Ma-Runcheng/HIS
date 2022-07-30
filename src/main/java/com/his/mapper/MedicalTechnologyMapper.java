package com.his.mapper;

import com.his.pojo.MedicalTechnology;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MedicalTechnologyMapper {
    /**
     * 查询医技项目，分页，与科室表连接
     * @param start 起始
     * @param pageSize 每页个数，默认10个
     * @return 医技
     */
    @Results({
            @Result(property = "id", column = "id",id = true),
            @Result(property = "department", column = "deptment_id",
                    one = @One(select = "com.his.mapper.DepartmentMapper.selectDepartmentById")),
    })
    @Select("select * from medical_technology where tech_name like concat('%',#{name},'%')" +
            " LIMIT #{start},#{pageSize}")
    List<MedicalTechnology> selectAllMedicalTechnologyAndDept(int start, int pageSize, String name);

    /**
     * 删除医技
     * @param id ID
     * @return true-成功，false-失败
     */
    @Delete("delete from medical_technology where id = #{id}")
    boolean deleteEmployeeById(int id);

    /**
     * 更新医技内容
     * @param medicalTechnology 包含新信息的医技
     * @return true-成功，false-失败
     */
    @Update("update medical_technology set tech_code=#{techCode}, tech_name=#{techName}," +
            "tech_format=#{techFormat},tech_price=#{techPrice},tech_type=#{techType}," +
            "price_type=#{priceType},deptment_id=#{deptmentId} where id = #{id}")
    boolean updateMedicalTechnology(MedicalTechnology medicalTechnology);

    /**
     * 添加
     * @param medicalTechnology 新医技项目
     * @return true-成功，false-失败
     */
    @Insert("insert into medical_technology (tech_code,tech_name,tech_format,tech_price,tech_type,price_type,deptment_id) " +
            "values (#{techCode},#{techName},#{techFormat},#{techPrice},#{techType},#{priceType},#{deptmentId})")
    boolean insertMedicalTechnology(MedicalTechnology medicalTechnology);
}
