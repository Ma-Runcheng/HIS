package com.his.service;

import com.his.pojo.Prescription;

import java.util.List;

public interface PrescriptionService {

    boolean insertPrescription(Prescription prescription);

    List<Prescription> selectPrescription(int registerId);
}
