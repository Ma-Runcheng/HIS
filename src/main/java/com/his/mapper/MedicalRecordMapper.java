package com.his.mapper;

import com.his.pojo.MedicalRecord;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface MedicalRecordMapper {
    @Insert("insert into medical_record (register_id,readme,present,present_treat,history,allergy,physique,proposal,careful)"+
    "values (#{registerId},#{readme},#{present},#{presentTreat},#{history},#{allergy},#{physique},#{proposal},#{careful})")
    boolean insertMedicalRecord(MedicalRecord medicalRecord);

    @Update("update medical_record set diagnosis=#{diagnosis},cure=#{cure} where register_id=#{id}")
    boolean updateResult(String diagnosis,String cure,int id);
}
