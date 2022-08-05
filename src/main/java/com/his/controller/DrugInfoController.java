package com.his.controller;


import com.his.pojo.Prescription;
import com.his.pojo.Register;
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


    @RequestMapping("/selectDrug")
    public List<DrugInfo> selectById(int id){return drugInfoService.selectById(id);}

    @RequestMapping("/giveList")
    public List<Register> giveList(){
        return drugInfoService.giveList();
    }

    @RequestMapping("/refundList")
    public List<Register> refundList() {
        return drugInfoService.refundList();
    }

    @RequestMapping("/change")
    public void stateChange(int id,String state){
        drugInfoService.stateChange(id,state);
    }

    @RequestMapping("/prescription")
    public List<Prescription> checkPrescription(int id) {
        return drugInfoService.checkPrescription(id);
    }

    @RequestMapping("/searchDrug")
    public List<DrugInfo> searchDrug(String drugname, String mnemoniccode){return drugInfoService.searchDrug(drugname,mnemoniccode);}
}
