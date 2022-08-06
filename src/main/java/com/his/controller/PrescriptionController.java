package com.his.controller;

import com.his.pojo.Prescription;
import com.his.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/prescription")
public class PrescriptionController {

    @Autowired
    PrescriptionService prescriptionService;

    @RequestMapping("insertPrescription")
//    public boolean insertPrescription(Prescription prescription){return prescriptionService.insertPrescription(prescription);}
    public boolean insertPrescription(int registerId,int drugId,String drugUsage,String drugNumber,String creationTime,String drugState){return prescriptionService.insertPrescription(registerId,drugId,drugUsage,drugNumber,creationTime,drugState);}

    @RequestMapping("/selectPrescription")
    public List<Prescription> selectPrescription(int registerId){return prescriptionService.selectPrescription(registerId);}
}
