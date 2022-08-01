package com.his.pojo;


public class Workload {

  private long id;
  private String doctorName;
  private String department;
  private java.sql.Date date;
  private long patient;
  private long invoice;
  private double westernMedicine;
  private double chinesePatentMedicine;
  private double chineseHerbalMedicine;
  private double registration;
  private double inspection;
  private double examination;
  private double treatment;

  @Override
  public String toString() {
    return "Workload{" +
            "id=" + id +
            ", doctorName='" + doctorName + '\'' +
            ", department='" + department + '\'' +
            ", date=" + date +
            ", patient=" + patient +
            ", invoice=" + invoice +
            ", westernMedicine=" + westernMedicine +
            ", chinesePatentMedicine=" + chinesePatentMedicine +
            ", chineseHerbalMedicine=" + chineseHerbalMedicine +
            ", registration=" + registration +
            ", inspection=" + inspection +
            ", examination=" + examination +
            ", treatment=" + treatment +
            '}';
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getDoctorName() {
    return doctorName;
  }

  public void setDoctorName(String doctorName) {
    this.doctorName = doctorName;
  }


  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }


  public java.sql.Date getDate() {
    return date;
  }

  public void setDate(java.sql.Date date) {
    this.date = date;
  }


  public long getPatient() {
    return patient;
  }

  public void setPatient(long patient) {
    this.patient = patient;
  }


  public long getInvoice() {
    return invoice;
  }

  public void setInvoice(long invoice) {
    this.invoice = invoice;
  }


  public double getWesternMedicine() {
    return westernMedicine;
  }

  public void setWesternMedicine(double westernMedicine) {
    this.westernMedicine = westernMedicine;
  }


  public double getChinesePatentMedicine() {
    return chinesePatentMedicine;
  }

  public void setChinesePatentMedicine(double chinesePatentMedicine) {
    this.chinesePatentMedicine = chinesePatentMedicine;
  }


  public double getChineseHerbalMedicine() {
    return chineseHerbalMedicine;
  }

  public void setChineseHerbalMedicine(double chineseHerbalMedicine) {
    this.chineseHerbalMedicine = chineseHerbalMedicine;
  }


  public double getRegistration() {
    return registration;
  }

  public void setRegistration(double registration) {
    this.registration = registration;
  }


  public double getInspection() {
    return inspection;
  }

  public void setInspection(double inspection) {
    this.inspection = inspection;
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

}
