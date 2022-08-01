package com.his.service;


import com.his.pojo.Register;

import java.util.List;

public interface RegisterService {
    List<Register> selectRegister(String cn,String rn);
    boolean deleteRegisterById(int id);

    boolean insertRegister(Register register);
}
