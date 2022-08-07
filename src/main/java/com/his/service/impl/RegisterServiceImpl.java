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
    public List<Register> selectRegister(String cn, String rn,int visitState) {
        return RegisterMapper.selectRegister(cn, rn,visitState);//应该全部
    }

    @Override
    public List<Register> showCaseNumber() {
        return RegisterMapper.showCaseNumber();
    }
    /**
     * 根据病历号删除挂号信息
     * @param
     * @return
     */
    @Override
    public boolean deleteRegister(String caseNumber) {
        return RegisterMapper.deleteRegister(caseNumber);
    }




    /**
     * 新建挂号信息
     * @param register
     * @return
     */
    @Override
    public boolean addRegister(Register register) {
        return RegisterMapper.addRegister(register);
    }
    public int updateVisitState(int vs, int id){return RegisterMapper.updateVisitState(vs,id);}
}
