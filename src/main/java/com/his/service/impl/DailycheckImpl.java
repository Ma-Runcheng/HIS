package com.his.service.impl;

import com.his.pojo.DailyCheck;
import com.his.mapper.DailycheckMapper;
import com.his.service.DailychekService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DailycheckImpl implements DailychekService {
    @Autowired
    DailycheckMapper dailycheckMapper;

    @Override
    public List<DailyCheck> searchdailychekinfo(String cashier, String date) {
        return dailycheckMapper.searchdailycheckList(cashier, date);
    }

    @Override
    public int submitdailycheck(String cashier, String date, String checkdate) {
        return dailycheckMapper.submitdailycheck(cashier,date,checkdate);
    }

    @Override
    public int dismissdailycheck(String cashier, String date) {
        return dailycheckMapper.dismissdailycheck(cashier, date);
    }
}
