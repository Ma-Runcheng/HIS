package com.his.service;


import com.his.mapper.SchedulingMapper;
import com.his.pojo.Scheduling;

import java.util.List;

public interface SchedulingService {
    List<Scheduling> getSchedulingList(String name);
    boolean updateScheduling(Scheduling scheduling);
    boolean insertScheduling(Scheduling scheduling);

}
