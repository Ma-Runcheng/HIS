package com.his.controller;

import com.his.pojo.Register;
import com.his.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
