package com.his.controller;


import com.his.service.DrugInfoService;
import com.his.pojo.DrugInfo;
import org.apache.ibatis.type.NClobTypeHandler;
import com.his.pojo.DrugInfo;
import com.his.service.DrugInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/drug")
public class DrugInfoController {

    @Autowired
    DrugInfoService drugInfoService;

    @RequestMapping("/list")
    public java.util.List<DrugInfo> list(String code, String name,String m_code){


        return drugInfoService.getDrugInfoList(code,name,m_code);
    }

    @RequestMapping("/update")
    public void updateById(int id,DrugInfo d){
        String context = toFirstChar(d.getDrugName());
        d.setMnemonicCode(context);
        drugInfoService.updateById(id,d);
    }

    @RequestMapping("/delete")
    public int deleteById(int id){
        return drugInfoService.deleteById(id);
    }

    @RequestMapping("/insert")
    public int insertDrugInfo(DrugInfo d){
        String context = toFirstChar(d.getDrugName());
        d.setMnemonicCode(context);
        return drugInfoService.insertDrugInfo(d);
    }


    public String toFirstChar(String str) {return drugInfoService.toFirstChar(str);}


    @RequestMapping("/searchDrug")
    public List<DrugInfo> searchDrug(String drugname, String mnemoniccode){return drugInfoService.searchDrug(drugname,mnemoniccode);}

}
