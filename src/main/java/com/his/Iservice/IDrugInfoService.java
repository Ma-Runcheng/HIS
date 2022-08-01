package com.his.Iservice;

import com.his.pojo.DrugInfo;

public interface IDrugInfoService {

    java.util.List<DrugInfo> getDrugInfoList(String code, String name);

    void updateById(int id,DrugInfo d);

    int deleteById(int id);

    int insertDrugInfo(DrugInfo d);
}
