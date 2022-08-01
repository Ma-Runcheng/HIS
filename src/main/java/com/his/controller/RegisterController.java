package com.his.controller;

import com.his.pojo.Employee;
import com.his.pojo.Register;
import com.his.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    RegisterService registerService;

    @RequestMapping("/selectRegister")
    public List<Register> selectRegister(String cn,String rn){
        return registerService.selectRegister(cn,rn);
    }

    /**
     * 删除
     * @param id ID
     * @return true-成功，false-失败
     */
    @RequestMapping("/deleteRegisterById")
    public boolean deleteRegisterbyId(int id){
        return registerService.deleteRegisterById(id);
    }


    /**
     * 添挂号信息
     * @param register 挂号信息
     * @return true-成功，false-失败
     */
    @RequestMapping(value = "/addRegister" , method = RequestMethod.POST)
    public boolean addRegister(@RequestBody Register register){
        return registerService.insertRegister(register);
    }
}
