package com.his.controller;


import com.his.pojo.Workload;
import com.his.service.DoctorWorkloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("doctorworkload")
public class DoctorWorkloadController {
    @Autowired
    DoctorWorkloadService doctorWorkloadService;

    @RequestMapping("allinfo")
    public List<Workload> getworkloadinfo() {
        return doctorWorkloadService.getworkloadinfo();
    }

    @RequestMapping("docinfo")
    public List<Workload> getdocworkloadinfo() {
        return doctorWorkloadService.getdocworkloadinfo();
    }

    @RequestMapping("searchinfo")
    public List<Workload> searchworkloadinfo(String name, String date1, String date2) {
        return doctorWorkloadService.searchworkloadinfo(name, date1, date2);
    }

    @RequestMapping("searchinfo1")
    public List<Workload> searchworkloadinfo1(String name, String date1, String date2) {
        return doctorWorkloadService.searchworkloadinfo1(name, date1, date2);
    }
}
