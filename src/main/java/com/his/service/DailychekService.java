package com.his.service;

import java.util.List;
import com.his.pojo.DailyCheck;

public interface DailychekService {
    List<DailyCheck> searchdailychekinfo(String cashier, String date);

    int submitdailycheck(String cashier, String date, String checkdate);

    int dismissdailycheck(String cashier, String date);
}
