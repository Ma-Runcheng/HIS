package com.his.service.impl;

import com.his.mapper.SchedulingMapper;
import com.his.pojo.Scheduling;
import com.his.service.SchedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchedulingServiceImpl implements SchedulingService {

    @Autowired
    SchedulingMapper schedulingMapper;

    @Override
    public List<Scheduling> getSchedulingList(String name) {
        return schedulingMapper.selectAllScheduling(name);
    }

    @Override
    public boolean updateScheduling(Scheduling scheduling) {
        return schedulingMapper.updateScheduling(scheduling);
    }

    @Override
    public boolean insertScheduling(Scheduling scheduling) {
        Scheduling oldScheduling = schedulingMapper.selectSchedulingByName(scheduling.getRuleName());
        if(oldScheduling != null){
            oldScheduling.setWeekRule(scheduling.getWeekRule());
            return schedulingMapper.updateScheduling(oldScheduling);
        }else{
            return schedulingMapper.insertScheduling(scheduling);
        }
    }
}
