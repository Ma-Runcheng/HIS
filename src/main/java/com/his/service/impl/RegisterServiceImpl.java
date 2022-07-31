package com.his.service.impl;

import com.his.mapper.RegisterMapper;
import com.his.pojo.Register;
import com.his.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    RegisterMapper registerMapper;

    public List<Register> selectRegister(String cn,String rn){
        return registerMapper.selectRegister(cn,rn);
    }
}
