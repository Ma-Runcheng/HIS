package com.his.controller;

import com.his.service.MedicalRecordDiseaseService;
import com.his.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/medicalRecordDisease")
public class MedicalRecordDiseaseController {

    @Autowired
    MedicalRecordDiseaseService medicalRecordDiseaseService;

    @RequestMapping("/addMedRec")
    public int addMedicalRecordDisease(int medicalRecordId,int diseaseId){return medicalRecordDiseaseService.addMedicalRecordDisease(medicalRecordId,diseaseId);}
}
