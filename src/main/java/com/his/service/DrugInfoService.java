package com.his.service;

import com.his.pojo.DrugInfo;

public interface DrugInfoService {

    java.util.List<DrugInfo> getDrugInfoList(String code, String name,String m_code);

    void updateById(int id,DrugInfo d);

    int deleteById(int id);

    int insertDrugInfo(DrugInfo d);

    String toFirstChar(String str);
}
