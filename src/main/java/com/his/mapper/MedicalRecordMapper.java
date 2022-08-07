package com.his.mapper;

import com.his.pojo.MedicalRecord;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface MedicalRecordMapper {
    @Insert("insert into medical_record (register_id,readme,present,present_treat,history,allergy,physique,proposal,careful)"+
    "values (#{registerId},#{readme},#{present},#{presentTreat},#{history},#{allergy},#{physique},#{proposal},#{careful})")
    boolean insertMedicalRecord(int registerId,String readme,String present,String presentTreat,String history,String allergy,String physique,String proposal,String careful);

    //boolean insertMedicalRecord(MedicalRecord medicalRecord);


    @Update("update medical_record set diagnosis=#{diagnosis},cure=#{cure} where register_id=#{id}")
    boolean updateResult(String diagnosis,String cure,int id);

    @Select("select * from medical_record where register_id=#{registerId}")
    List<MedicalRecord> selectMedicalRecordId(int registerId);
}
