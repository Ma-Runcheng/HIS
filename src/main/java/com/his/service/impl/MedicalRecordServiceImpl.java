package com.his.service.impl;

import com.his.mapper.MedicalRecordMapper;
import com.his.pojo.MedicalRecord;
import com.his.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalRecordServiceImpl implements MedicalRecordService {

    @Autowired
    private MedicalRecordMapper medicalRecordMapper;

    @Override
    //public boolean insertMedicalRecord(MedicalRecord medicalRecord){ return medicalRecordMapper.insertMedicalRecord(medicalRecord); }
    public boolean insertMedicalRecord(int registerId,String readme,String present,String presentTreat,String history,String allergy,String physique,String proposal,String careful){
        return medicalRecordMapper.insertMedicalRecord(registerId,readme,present,presentTreat,history,allergy,physique,proposal,careful);
    }

    @Override
    public boolean updateResult(String diagnosis,String cure,int id){return medicalRecordMapper.updateResult(diagnosis,cure,id);}

    @Override
    public List<MedicalRecord> selectMedicalRecordId(int registerId){return medicalRecordMapper.selectMedicalRecordId(registerId);}
}