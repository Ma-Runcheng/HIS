package com.his.service.impl;

import com.his.mapper.PrescriptionMapper;
import com.his.pojo.Prescription;
import com.his.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrescriptionServiceImpl implements PrescriptionService {

    @Autowired
    PrescriptionMapper prescriptionMapper;

    @Override
    public boolean insertPrescription(Prescription prescription){return prescriptionMapper.insertPrescription(prescription);}

    @Override
    public List<Prescription> selectPrescription(int registerId){return prescriptionMapper.selectPrescription(registerId);}
}