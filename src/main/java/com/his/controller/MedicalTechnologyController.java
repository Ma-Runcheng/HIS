package com.his.controller;

import com.his.pojo.MedicalTechnology;
import com.his.service.MedicalTechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/non-drugCharge")
public class MedicalTechnologyController {

    @Autowired
    MedicalTechnologyService medicalTechnologyService;

    @RequestMapping("/getMedicalTechnology")
    public List<MedicalTechnology> getMedicalTechnologyList(@RequestParam(defaultValue = "1" ) Integer page,
                                                            @RequestParam(defaultValue = "10") Integer pageSize,
                                                            @RequestParam(defaultValue = "") String name){
        return medicalTechnologyService.getMedicalTechnologyList(page,pageSize,name);
    }

    @RequestMapping("/deleteById")
    public boolean deleteMedicalTechnology(int id){
        return medicalTechnologyService.deleteMedicalTechnologyById(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public boolean updateMedicalTechnology(@RequestBody MedicalTechnology medicalTechnology){
        return medicalTechnologyService.updateMedicalTechnology(medicalTechnology);
    }

    @RequestMapping(value = "/addMedicalTechnology", method = RequestMethod.POST)
    public boolean addMedicalTechnology(@RequestBody MedicalTechnology medicalTechnology){
        return medicalTechnologyService.insertMedicalTechnology(medicalTechnology);
    }
}
