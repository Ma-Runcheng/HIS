package com.his.service.impl;

import com.his.mapper.MedicalRecordMapper;
import com.his.pojo.MedicalRecord;
import com.his.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicalRecordServiceImpl implements MedicalRecordService {

    @Autowired
    private MedicalRecordMapper medicalRecordMapper;

    @Override
    public boolean insertMedicalRecord(MedicalRecord medicalRecord){ return medicalRecordMapper.insertMedicalRecord(medicalRecord); }

    public boolean updateResult(String diagnosis,String cure,int id){return medicalRecordMapper.updateResult(diagnosis,cure,id);}
}
