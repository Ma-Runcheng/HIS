package com.his.service.impl;

import com.his.mapper.MedicalTechnologyMapper;
import com.his.pojo.MedicalTechnology;
import com.his.service.MedicalTechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalTechnologyServiceImpl implements MedicalTechnologyService {

    @Autowired
    MedicalTechnologyMapper medicalTechnologyMapper;

    @Override
    public List<MedicalTechnology> getMedicalTechnologyList(int page, int pageSize, String name) {
        int start = (page - 1) * 10;
        return medicalTechnologyMapper.selectAllMedicalTechnologyAndDept(start,pageSize,name);
    }

    @Override
    public boolean deleteMedicalTechnologyById(int id) {
        return medicalTechnologyMapper.deleteEmployeeById(id);
    }

    @Override
    public boolean updateMedicalTechnology(MedicalTechnology medicalTechnology) {
        return medicalTechnologyMapper.updateMedicalTechnology(medicalTechnology);
    }

    @Override
    public boolean insertMedicalTechnology(MedicalTechnology medicalTechnology) {
        return medicalTechnologyMapper.insertMedicalTechnology(medicalTechnology);
    }
}
