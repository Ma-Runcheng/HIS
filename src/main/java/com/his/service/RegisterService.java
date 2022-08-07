package com.his.service;


import com.his.pojo.Register;

import java.util.List;

public interface RegisterService {
    List<Register> selectRegister(String cn,String rn,int visitState);

    List<Register> showCaseNumber();
    boolean deleteRegister(String caseNumber);

    boolean addRegister(Register register);
    int updateVisitState(int vs,int id);
}
