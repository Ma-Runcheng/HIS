package com.his.controller;


import com.his.service.DailychekService;
import com.his.pojo.DailyCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("dailycheck")
public class DailycheckController {
    @Autowired
    DailychekService dailychekService;

    @RequestMapping("searchinfo")
    public List<DailyCheck> searchdailycheckinfo(String cashier, String date) {
        return dailychekService.searchdailychekinfo(cashier,date);
    }

    @RequestMapping("submit")
    public int submitcheck(String cashier, String date,String  checkdate) {
        return dailychekService.submitdailycheck(cashier,date,checkdate);
    }

    @RequestMapping("dismiss")
    public int dismisscheck(String cashier, String date) {
        return dailychekService.dismissdailycheck(cashier, date);
    }
}
