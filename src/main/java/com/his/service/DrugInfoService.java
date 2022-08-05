package com.his.service;

import com.his.pojo.DrugInfo;
import com.his.pojo.Prescription;
import com.his.pojo.Register;

import java.util.List;

public interface DrugInfoService {

    List<DrugInfo> getDrugInfoList(String code, String name,String m_code);

    void updateById(int id,DrugInfo d);

    int deleteById(int id);

    int insertDrugInfo(DrugInfo d);

    String toFirstChar(String str);

    List<DrugInfo> selectById(int id);

    List<Register> giveList();

    List<Register> refundList();

    void stateChange(int id,String state);

    List<Prescription> checkPrescription(int id);

    List<DrugInfo> searchDrug(String drugname, String mnemoniccode);
}
