package com.his.controller;

import com.his.pojo.ExpenseInfo;
import com.his.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/expenseinfo")
public class ExpenseController {
    @Autowired
    ExpenseService expenseService;

    @RequestMapping("allinfo")
    public List<ExpenseInfo> getExpenseInfo(){
        return expenseService.getExpenseInfo();
    }

    @RequestMapping("searchinfo")
    public List<ExpenseInfo> searchExpenseInfo(String code, String name, String type) {
        return expenseService.searchExpenseInfo(code, name, type);
    }

    @RequestMapping("deleteinfo")
    int deleteExpense(int id) {
        return expenseService.deleteExpenseInfo(id);
    }

    @RequestMapping("updateinfo")
    int updateExpense(int id, String code, String name, float price, String description) {
        return expenseService.updateExpenseInfo(id, code, name, price, description);
    }

    @RequestMapping("/insertinfo")
    int insertExpense(String code, String name, float price, String description) {
        return expenseService.insertExpenseInfo(code, name, price, description);
    }

}
