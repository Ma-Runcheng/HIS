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
    RegisterMapper RegisterMapper;

    /**
     * 根据病历号、姓名进行挂号信息查询
     * @param cn
     * @param rn
     * @return register
     */
    @Override
    public List<Register> selectRegister(String cn, String rn) {
        return RegisterMapper.selectRegister(cn, rn);//应该全部
    }

    /**
     * 根据病历号删除挂号信息
     * @param id
     * @return
     */
    @Override
    public boolean deleteRegisterById(int id) {
        return true;
    }

    /**
     * 新建挂号信息
     * @param register
     * @return
     */
    @Override
    public boolean insertRegister(Register register) {
        return true;
    }
}
