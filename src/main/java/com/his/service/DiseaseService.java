package com.his.service;

import com.his.pojo.Disease;

import java.util.List;

public interface DiseaseService {
    List<Disease> getDiseaseList(int page, int pageSize, String name);
    boolean deleteDisease(int id);
    boolean updateDisease(Disease disease);

    List<Disease> selectDisease(String dc,String dn);

}
