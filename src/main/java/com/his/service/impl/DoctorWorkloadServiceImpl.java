package com.his.service.impl;

import com.his.mapper.DoctorWorkloadMapper;
import com.his.pojo.Workload;
import com.his.service.DoctorWorkloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorWorkloadServiceImpl implements DoctorWorkloadService {
    @Autowired
    DoctorWorkloadMapper doctorWorkloadMapper;

    @Override
    public List<Workload> getworkloadinfo() {
        return doctorWorkloadMapper.selectallworkload();
    }

    @Override
    public List<Workload> getdocworkloadinfo() {
        return doctorWorkloadMapper.selectdcoworkload();
    }

    @Override
    public List<Workload> searchworkloadinfo(String name, String date1, String date2) {
        return doctorWorkloadMapper.searchworkloadList(name, date1, date2);
    }

    @Override
    public List<Workload> searchworkloadinfo1(String name, String date1, String date2) {
        return doctorWorkloadMapper.searchworkloadList1(name, date1, date2);
    }
}
