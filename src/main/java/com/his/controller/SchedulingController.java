package com.his.controller;

import com.his.pojo.Scheduling;
import com.his.service.SchedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/scheduling")
public class SchedulingController {

    @Autowired
    SchedulingService schedulingService;

    @RequestMapping("/allScheduling")
    public List<Scheduling> getSchedulingList(@RequestParam(defaultValue = "") String name){
        return schedulingService.getSchedulingList(name);
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public boolean updateScheduling(@RequestBody Scheduling scheduling){
        return schedulingService.updateScheduling(scheduling);
    }

    @RequestMapping(value = "/addScheduling",method = RequestMethod.POST)
    public boolean addScheduling(@RequestBody Scheduling scheduling){
        return schedulingService.insertScheduling(scheduling);
    }
}
