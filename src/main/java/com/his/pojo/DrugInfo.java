package com.his.pojo;


public class DrugInfo {

  private long id;
  private String drugCode;
  private String drugName;
  private String drugFormat;
  private String manufacturer;
  private double drugPrice;
  private String mnemonicCode;
  private long delMark;

  @Override
  public String toString() {
    return "DrugInfo{" +
            "id=" + id +
            ", drugCode='" + drugCode + '\'' +
            ", drugName='" + drugName + '\'' +
            ", drugFormat='" + drugFormat + '\'' +
            ", manufacturer='" + manufacturer + '\'' +
            ", drugPrice=" + drugPrice +
            ", mnemonicCode='" + mnemonicCode + '\'' +
            ", delMark=" + delMark +
            '}';
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getDrugCode() {
    return drugCode;
  }

  public void setDrugCode(String drugCode) {
    this.drugCode = drugCode;
  }


  public String getDrugName() {
    return drugName;
  }

  public void setDrugName(String drugName) {
    this.drugName = drugName;
  }


  public String getDrugFormat() {
    return drugFormat;
  }

  public void setDrugFormat(String drugFormat) {
    this.drugFormat = drugFormat;
  }


  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }


  public double getDrugPrice() {
    return drugPrice;
  }

  public void setDrugPrice(double drugPrice) {
    this.drugPrice = drugPrice;
  }


  public String getMnemonicCode() {
    return mnemonicCode;
  }

  public void setMnemonicCode(String mnemonicCode) {
    this.mnemonicCode = mnemonicCode;
  }


  public long getDelMark() {
    return delMark;
  }

  public void setDelMark(long delMark) {
    this.delMark = delMark;
  }

}
