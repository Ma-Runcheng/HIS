package com.his.controller;

import com.his.Iservice.IDrugInfoService;
import com.his.pojo.DrugInfo;
import org.apache.catalina.AccessLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/drug")
public class DrugInfoController {

    @Autowired
    IDrugInfoService drugInfoService;

    @RequestMapping("/list")
    public java.util.List<DrugInfo> list(String code, String name){

        return drugInfoService.getDrugInfoList(code,name);
    }

    @RequestMapping("/update")
    public void updateById(int id,DrugInfo d){
        drugInfoService.updateById(id,d);
    }

    @RequestMapping("/delete")
    public int deleteById(int id){
        return drugInfoService.deleteById(id);
    }

    @RequestMapping("/insert")
    public int insertDrugInfo(DrugInfo d){
        return drugInfoService.insertDrugInfo(d);
    }



}
