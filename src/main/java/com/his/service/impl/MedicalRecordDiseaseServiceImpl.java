package com.his.service.impl;

import com.his.mapper.MedicalRecordDiseaseMapper;
import com.his.mapper.MedicalRecordMapper;
import com.his.service.MedicalRecordDiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicalRecordDiseaseServiceImpl implements MedicalRecordDiseaseService {

    @Autowired
    MedicalRecordDiseaseMapper medicalRecordDiseaseMapper;

    @Override
    public int addMedicalRecordDisease(int medicalRecordId,int diseaseId){return medicalRecordDiseaseMapper.addMedicalRecordDisease(medicalRecordId,diseaseId);}
}
