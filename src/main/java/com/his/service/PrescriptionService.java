package com.his.service;

import com.his.pojo.Prescription;

import java.util.List;

public interface PrescriptionService {

//    boolean insertPrescription(Prescription prescription);
boolean insertPrescription(int registerId,int drugId,String drugUsage,String drugNumber,String creationTime,String drugState);


    List<Prescription> selectPrescription(int registerId);
}
