package com.his.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MedicalRecordDiseaseMapper {

    @Insert("insert into medical_record_disease(medical_record_id,disease_id) values(#{medicalRecordId},#{diseaseId})")
    int addMedicalRecordDisease(int medicalRecordId,int diseaseId);
}
