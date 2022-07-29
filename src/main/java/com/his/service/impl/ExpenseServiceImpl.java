package com.his.service.impl;

import com.his.mapper.ExpenseMapper;
import com.his.pojo.ExpenseInfo;
import com.his.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService {
    @Autowired
    private ExpenseMapper expenseMapper;

    @Override
    public List<ExpenseInfo> getExpenseInfo() {
        return expenseMapper.selectAllExpenses();
    }

    @Override
    public List<ExpenseInfo> searchExpenseInfo(String code, String name, String type) {
        return expenseMapper.searchExpenseList(code, name, type);
    }

    @Override
    public int deleteExpenseInfo(int id) {
        return expenseMapper.deleteExpense(id);
    }

    @Override
    public int updateExpenseInfo(int id, String code, String name, float price, String description) {
        return expenseMapper.updateExpense(id, code, name, price, description);
    }

    @Override
    public int insertExpenseInfo(String code, String name, float price, String description) {
        return expenseMapper.insertExpense(code, name, price, description);
    }
}
