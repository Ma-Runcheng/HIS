package com.his.pojo;


public class DailyCheck {

  private long id;
  private String cashier;
  private java.sql.Date date;
  private long originalInvoice;
  private long voidInvoice;
  private long newInvoice;
  private double totalAmount;
  private double selffundedAmount;
  private double deductibleAmount;
  private double reimbursementAmount;
  private double westernMedicine;
  private double chineseMedicine;
  private double registration;
  private double examination;
  private double treatment;
  private double hospitalization;
  private long checkMark;
  private java.sql.Timestamp checkDate;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getCashier() {
    return cashier;
  }

  public void setCashier(String cashier) {
    this.cashier = cashier;
  }


  public java.sql.Date getDate() {
    return date;
  }

  public void setDate(java.sql.Date date) {
    this.date = date;
  }


  public long getOriginalInvoice() {
    return originalInvoice;
  }

  public void setOriginalInvoice(long originalInvoice) {
    this.originalInvoice = originalInvoice;
  }


  public long getVoidInvoice() {
    return voidInvoice;
  }

  public void setVoidInvoice(long voidInvoice) {
    this.voidInvoice = voidInvoice;
  }


  public long getNewInvoice() {
    return newInvoice;
  }

  public void setNewInvoice(long newInvoice) {
    this.newInvoice = newInvoice;
  }


  public double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(double totalAmount) {
    this.totalAmount = totalAmount;
  }


  public double getSelffundedAmount() {
    return selffundedAmount;
  }

  public void setSelffundedAmount(double selffundedAmount) {
    this.selffundedAmount = selffundedAmount;
  }


  public double getDeductibleAmount() {
    return deductibleAmount;
  }

  public void setDeductibleAmount(double deductibleAmount) {
    this.deductibleAmount = deductibleAmount;
  }


  public double getReimbursementAmount() {
    return reimbursementAmount;
  }

  public void setReimbursementAmount(double reimbursementAmount) {
    this.reimbursementAmount = reimbursementAmount;
  }


  public double getWesternMedicine() {
    return westernMedicine;
  }

  public void setWesternMedicine(double westernMedicine) {
    this.westernMedicine = westernMedicine;
  }


  public double getChineseMedicine() {
    return chineseMedicine;
  }

  public void setChineseMedicine(double chineseMedicine) {
    this.chineseMedicine = chineseMedicine;
  }


  public double getRegistration() {
    return registration;
  }

  public void setRegistration(double registration) {
    this.registration = registration;
  }


  public double getExamination() {
    return examination;
  }

  public void setExamination(double examination) {
    this.examination = examination;
  }


  public double getTreatment() {
    return treatment;
  }

  public void setTreatment(double treatment) {
    this.treatment = treatment;
  }


  public double getHospitalization() {
    return hospitalization;
  }

  public void setHospitalization(double hospitalization) {
    this.hospitalization = hospitalization;
  }


  public long getCheckMark() {
    return checkMark;
  }

  public void setCheckMark(long checkMark) {
    this.checkMark = checkMark;
  }


  public java.sql.Timestamp getCheckDate() {
    return checkDate;
  }

  public void setCheckDate(java.sql.Timestamp checkDate) {
    this.checkDate = checkDate;
  }

}
