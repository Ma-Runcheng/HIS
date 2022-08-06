package com.his.mapper;

import com.his.pojo.DrugInfo;
import com.his.pojo.Prescription;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PrescriptionMapper {

    @Insert("insert into prescription (register_id,drug_id,drug_usage,drug_number,creation_time,drug_state)"+
            "values (#{registerId},#{drugId},#{drugUsage},#{drugNumber},#{creationTime},#{drugState})")
    boolean insertPrescription(int registerId,int drugId,String drugUsage,String drugNumber,String creationTime,String drugState);
    //    boolean insertPrescription(Prescription prescription);

//    @Results({
//            @Result(property = "registerId",column = "register_id"),
//            @Result(property = "drugInfo",column = "drug_id",javaType = DrugInfo.class, one = @One(select = "com.his.mapper.DrugInfoMapper.selectById"))
//    })
    @Select("select * from prescription inner join  drug_info on prescription.drug_id=drug_info.id where register_id=#{registerId}")
    List<Prescription> selectPrescription(int registerId);
}
