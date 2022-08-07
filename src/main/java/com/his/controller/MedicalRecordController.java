package com.his.controller;

import com.his.pojo.MedicalRecord;
import com.his.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/medicalRecord")
public class MedicalRecordController {

    @Autowired
    private MedicalRecordService medicalRecordService;

    @RequestMapping("/insertRecord")
    //public boolean insertMedicalRecord(MedicalRecord medicalRecord){ return medicalRecordService.insertMedicalRecord(medicalRecord);}
    public boolean insertMedicalRecord(int registerId,String readme,String present,String presentTreat,String history,String allergy,String physique,String proposal,String careful) {
        return medicalRecordService.insertMedicalRecord(registerId,readme,present,presentTreat,history,allergy,physique,proposal,careful);
    }
    @RequestMapping("/insertResult")
    public boolean updateResult(String diagnosis,String cure,int id){return medicalRecordService.updateResult(diagnosis,cure,id);}

    @RequestMapping("/selectId")
    public List<MedicalRecord> selectMedicalRecordId(int registerId){return medicalRecordService.selectMedicalRecordId(registerId);}
}
