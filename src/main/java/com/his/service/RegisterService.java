package com.his.service;


import com.his.pojo.Register;

import java.util.List;

public interface RegisterService {
    List<Register> selectRegister(String cn,String rn);

    List<Register> showCaseNumber();
    boolean deleteRegister(int caseNumber);

    boolean addRegister(Register register);
    int updateVisitState(int vs,int id);
}
