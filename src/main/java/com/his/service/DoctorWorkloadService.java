package com.his.service;

import com.his.pojo.Workload;

import java.util.List;


public interface DoctorWorkloadService {
    List<Workload> getworkloadinfo();

    List<Workload> getdocworkloadinfo();

    List<Workload> searchworkloadinfo(String name, String date1, String date2);

    List<Workload> searchworkloadinfo1(String name, String date1, String date2);
}
