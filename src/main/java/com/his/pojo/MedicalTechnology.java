package com.his.pojo;



public class MedicalTechnology {

  private long id;
  private String techCode;
  private String techName;
  private String techFormat;
  private double techPrice;
  private String techType;
  private String priceType;
  private long deptmentId;
  private Department department;

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getTechCode() {
    return techCode;
  }

  public void setTechCode(String techCode) {
    this.techCode = techCode;
  }


  public String getTechName() {
    return techName;
  }

  public void setTechName(String techName) {
    this.techName = techName;
  }


  public String getTechFormat() {
    return techFormat;
  }

  public void setTechFormat(String techFormat) {
    this.techFormat = techFormat;
  }


  public double getTechPrice() {
    return techPrice;
  }

  public void setTechPrice(double techPrice) {
    this.techPrice = techPrice;
  }


  public String getTechType() {
    return techType;
  }

  public void setTechType(String techType) {
    this.techType = techType;
  }


  public String getPriceType() {
    return priceType;
  }

  public void setPriceType(String priceType) {
    this.priceType = priceType;
  }


  public long getDeptmentId() {
    return deptmentId;
  }

  public void setDeptmentId(long deptmentId) {
    this.deptmentId = deptmentId;
  }

}
