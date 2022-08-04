package com.his.service.impl;

import com.his.mapper.DiseaseMapper;
import com.his.pojo.Disease;
import com.his.service.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiseaseServiceImpl implements DiseaseService {

    @Autowired
    DiseaseMapper diseaseMapper;

    @Override
    public List<Disease> getDiseaseList(int page, int pageSize, String name) {
        int start = (page - 1) * 10;
        return diseaseMapper.selectAllDisease(start,pageSize,name);
    }

    @Override
    public boolean deleteDisease(int id) {
        return diseaseMapper.deleteDisease(id);
    }

    @Override
    public boolean updateDisease(Disease disease) {
        return diseaseMapper.updateDisease(disease);
    }

    @Override
    public List<Disease> selectDisease(String dc,String dn){ return diseaseMapper.selectDisease(dc,dn);}
}
