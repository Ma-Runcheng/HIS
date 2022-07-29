package com.sample;


public class ExpenseInfo {

  private long id;
  private String expenseCode;
  private String expenseName;
  private double expensePrice;
  private String expenseDescription;
  private long delMark;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getExpenseCode() {
    return expenseCode;
  }

  public void setExpenseCode(String expenseCode) {
    this.expenseCode = expenseCode;
  }


  public String getExpenseName() {
    return expenseName;
  }

  public void setExpenseName(String expenseName) {
    this.expenseName = expenseName;
  }


  public double getExpensePrice() {
    return expensePrice;
  }

  public void setExpensePrice(double expensePrice) {
    this.expensePrice = expensePrice;
  }


  public String getExpenseDescription() {
    return expenseDescription;
  }

  public void setExpenseDescription(String expenseDescription) {
    this.expenseDescription = expenseDescription;
  }


  public long getDelMark() {
    return delMark;
  }

  public void setDelMark(long delMark) {
    this.delMark = delMark;
  }

}
