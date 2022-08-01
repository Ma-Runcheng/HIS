package com.his.service;

import com.his.pojo.Workload;

import java.util.List;

public interface DepartmentWorkloadService {
    List<Workload> getdeptworkloadinfo();

    List<Workload> searchdeptworkloadinfo(String dept, String date1, String date2);

}
