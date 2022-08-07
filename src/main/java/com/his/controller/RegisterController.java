package com.his.controller;

import com.his.pojo.Employee;
import com.his.pojo.Register;
import com.his.service.RegisterService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    RegisterService registerService;
    @RequestMapping("/showCaseNumber")
    public List<Register> showCaseNumber(){
        return registerService.showCaseNumber();
    }
    @RequestMapping(value ="/selectRegister")
    public List<Register> selectRegister(@RequestParam(value = "caseNumber") String caseNumber,@RequestParam(value = "realName") String realName){
//        ,@RequestParam(value = "realName") String realName
        System.out.println("caseNumber="+caseNumber);
        return registerService.selectRegister(caseNumber,realName,1);
    }

    /**
     * 删除

     * @return true-成功，false-失败
     */
    @RequestMapping("/deleteRegister")
    public boolean deleteRegister( String caseNumber){return registerService.deleteRegister(caseNumber);
    }

    /**
     * 添挂号信息
     * @param register 挂号信息
     * @return true-成功，false-失败
     */
    @RequestMapping(value = "/addRegister" , method = RequestMethod.POST)
    public boolean addRegister(@RequestBody Register register){
        return registerService.addRegister(register);
    }

    @RequestMapping("/updateVisitState")
    public int updateVisitState(int vs,int id){return registerService.updateVisitState(vs,id);}
}
