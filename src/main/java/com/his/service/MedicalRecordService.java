package com.his.service;

import com.his.pojo.MedicalRecord;

public interface MedicalRecordService {
    boolean insertMedicalRecord(MedicalRecord medicalRecord);
    boolean updateResult(String diagnosis,String cure,int id);
}
