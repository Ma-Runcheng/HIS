package com.his.service;

import com.his.pojo.MedicalTechnology;

import java.util.List;

public interface MedicalTechnologyService {
    List<MedicalTechnology> getMedicalTechnologyList(int page, int pageSize, String name);
    boolean deleteMedicalTechnologyById(int id);
    boolean updateMedicalTechnology(MedicalTechnology medicalTechnology);
    boolean insertMedicalTechnology(MedicalTechnology medicalTechnology);
}
