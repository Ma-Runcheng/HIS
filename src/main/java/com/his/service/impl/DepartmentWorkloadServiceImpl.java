package com.his.service.impl;


import com.his.mapper.DepartmentWorkloadMapper;
import com.his.pojo.Workload;
import com.his.service.DepartmentService;
import com.his.service.DepartmentWorkloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentWorkloadServiceImpl implements DepartmentWorkloadService {
    @Autowired
    DepartmentWorkloadMapper departmentWorkloadMapper;

    @Override
    public List<Workload> getdeptworkloadinfo() {
        return departmentWorkloadMapper.getdeptworkloadinfo();
    }

    @Override
    public List<Workload> searchdeptworkloadinfo(String dept, String date1, String date2) {
        return departmentWorkloadMapper.searchdeptworkloadList(dept, date1, date2);
    }

}
