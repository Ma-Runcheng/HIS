package com.his.controller;

import com.his.pojo.Disease;
import com.his.service.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/disease")
public class DiseaseController {

    @Autowired
    DiseaseService diseaseService;

    @RequestMapping("/allDisease")
    public List<Disease> getDiseaseList(@RequestParam(defaultValue = "1" ) Integer page,
                                        @RequestParam(defaultValue = "10") Integer pageSize,
                                        @RequestParam(defaultValue = "") String name){
        return diseaseService.getDiseaseList(page,pageSize,name);
    }

    @RequestMapping("/deleteById")
    public boolean deleteById(int id){
        return diseaseService.deleteDisease(id);
    }

    @RequestMapping(value = "/updateDisease", method = RequestMethod.POST)
    public boolean updateDisease(@RequestBody Disease disease){
        return diseaseService.updateDisease(disease);
    }

    @RequestMapping("/selectDisease")
    public List<Disease> selectDisease(String dc,String dn){ return diseaseService.selectDisease(dc,dn); }
}
