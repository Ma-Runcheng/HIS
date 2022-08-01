package com.his.service;

import com.his.Iservice.IDrugInfoService;
import com.his.mapper.DrugInfoMapper;
import com.his.pojo.DrugInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugInfoService implements IDrugInfoService {

    @Autowired
    DrugInfoMapper drugInfoMapper;

//    @Override
//    public List<DrugInfo> getDrugInfoList(String code, String name) {
//        return drugInfoMapper.getDrugInfoList(null,"葡萄糖");
//    }

    @Override
    public List<DrugInfo> getDrugInfoList(String code, String name) {
        return drugInfoMapper.getDrugInfoList(code,name);
    }


    @Override
    public void updateById(int id, DrugInfo d) {
        drugInfoMapper.updateById(id, d);
    }

    @Override
    public int deleteById(int id){
        System.out.println(id);
        return drugInfoMapper.deleteById(id);
    }

    @Override
    public int insertDrugInfo(DrugInfo d){
        System.out.println(d);
        return drugInfoMapper.insertDrugInfo(d);
    }
}
