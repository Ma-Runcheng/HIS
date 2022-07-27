package com.his.service;


import org.springframework.stereotype.Service;

import java.util.List;
import com.his.pojo.Department;

public interface DepartmentService {
    List<Department> getDepartmentList();
    boolean deleteDepartment(String code);
    boolean updateDepartment(Department newDepartment);
}
