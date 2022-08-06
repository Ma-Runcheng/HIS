package com.his.service;

import com.his.pojo.MedicalRecord;

import java.util.List;

public interface MedicalRecordService {
   // boolean insertMedicalRecord(MedicalRecord medicalRecord);
    boolean insertMedicalRecord(int registerId,String readme,String present,String presentTreat,String history,String allergy,String physique,String proposal,String careful);
    boolean updateResult(String diagnosis,String cure,int id);

    List<MedicalRecord> selectMedicalRecordId(int registerId);
}
