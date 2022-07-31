package com.his.mapper;

import com.his.pojo.Register;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RegisterMapper {

    @Select("select * from register where case_number=#{cn} or real_name like concat('%',#{rn},'%')")
    List<Register> selectRegister(String cn,String rn);
}
