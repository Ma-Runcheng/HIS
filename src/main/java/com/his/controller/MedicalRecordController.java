package com.his.controller;

import com.his.pojo.MedicalRecord;
import com.his.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/medicalRecord")
public class MedicalRecordController {

    @Autowired
    private MedicalRecordService medicalRecordService;

    @RequestMapping("/insertRecord")
    public boolean insertMedicalRecord(MedicalRecord medicalRecord){ return medicalRecordService.insertMedicalRecord(medicalRecord);}

    @RequestMapping("/insertResult")
    public boolean updateResult(String diagnosis,String cure,int id){return medicalRecordService.updateResult(diagnosis,cure,id);}
}
