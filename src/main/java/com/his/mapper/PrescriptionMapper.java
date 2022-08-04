package com.his.mapper;

import com.his.pojo.Prescription;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PrescriptionMapper {

    @Insert("insert into prescription (register_id,drug_id,drug_usage,drug_number,creation_time)"+
            "values (#{registerId},#{drugId},#{drugUsage},#{drugNumber},#{creationTime})")
    boolean insertPrescription(Prescription prescription);

    @Results({
            @Result(property = "register_id",column = "register_id",id = false),
            @Result(property = "drug_info",column = "register_id",many = @Many(select = "com.his.mapper.DrugInfoMapper.selectDruginfoById"))
    })
    @Select("select * from prescription where register_id=#{registerId}")
    List<Prescription> selectPrescription(int registerId);
}
