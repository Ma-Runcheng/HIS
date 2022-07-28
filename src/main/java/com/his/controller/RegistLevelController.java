package com.his.controller;

import com.his.pojo.RegistLevel;
import com.his.service.RegistLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/registLevel")
public class RegistLevelController {
    @Autowired
    RegistLevelService registLevelService;

    /**
     * 所有挂号级别
     * @return 所有挂号级别pojo对象
     */
    @RequestMapping("/allRegistLevel")
    public List<RegistLevel> getRegistLevelList(){
        return registLevelService.getRegistLevelList();
    }

    /**
     * 通过id删除
     * @param id
     * @return true-成功，false-失败
     */
    @RequestMapping("/deleteById")
    public boolean deleteRegistLevelById(String id){
        return registLevelService.deleteRegistLevelById(id);
    }

    /**
     * 更新
     * @param registLevel
     * @return true-成功，false-失败
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public boolean updateRegistLevel(@RequestBody RegistLevel registLevel){
        return registLevelService.updateRegistLevel(registLevel);
    }

    /**
     * 添加新挂号级别
     * @param registLevel
     * @return true-成功，false-失败
     */
    @RequestMapping(value = "addRegistLevel", method = RequestMethod.POST)
    public boolean addRegistLevel(@RequestBody RegistLevel registLevel){
        return registLevelService.addRegistLevel(registLevel);
    }

}
