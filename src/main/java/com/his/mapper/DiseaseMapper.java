package com.his.mapper;

import com.his.pojo.Disease;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface DiseaseMapper {

    @Select("select * from disease where disease_name like concat('%',#{name},'%') LIMIT #{start},#{pageSize}")
    List<Disease> selectAllDisease(int start, int pageSize, String name);

    @Delete("delete from disease where id = #{id}")
    boolean deleteDisease(int id);

    @Update("update disease set disease_code = #{diseaseCode}," +
            "disease_name = #{diseaseName},diseaseICD = #{diseaseIcd} where id = #{id}")
    boolean updateDisease(Disease disease);

    @Select("select * from disease where disease_code like concat('%',#{dc},'%') and disease_name like concat('%',#{dn},'%')")
    List<Disease> selectDisease(String dc,String dn);
}
