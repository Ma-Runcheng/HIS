package com.his.controller;

import com.his.pojo.Workload;
import com.his.service.DepartmentWorkloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("departmentworkload")
public class DepartmentWorkloadController {
    @Autowired
    DepartmentWorkloadService departmentWorkloadService;

    @RequestMapping("allinfo")
    public List<Workload> getdeptworkloadinfo() {
        return departmentWorkloadService.getdeptworkloadinfo();
    }

    @RequestMapping("searchinfo")
    public List<Workload> searchdeptworkloadinfo(String dept, String date1, String date2) {
        return departmentWorkloadService.searchdeptworkloadinfo(dept, date1, date2);
    }

}
