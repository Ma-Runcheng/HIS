package com.his.service;

import com.his.pojo.Department;
import com.his.pojo.RegistLevel;

import java.util.List;

public interface RegistLevelService {
    List<RegistLevel> getRegistLevelList();
    boolean deleteRegistLevelById(String id);
    boolean updateRegistLevel(RegistLevel newRegistLevel);
    boolean addRegistLevel(RegistLevel newRegistLevel);

}
