package com.his.service;

import com.his.pojo.ExpenseInfo;

import java.util.List;


public interface ExpenseService {
    List<ExpenseInfo> getExpenseInfo();

    List<ExpenseInfo> searchExpenseInfo(String code, String name, String type);

    int deleteExpenseInfo(int id);

    int updateExpenseInfo(int id, String code, String name, float price, String description);

    int insertExpenseInfo(String code, String name, float price, String description);

}
