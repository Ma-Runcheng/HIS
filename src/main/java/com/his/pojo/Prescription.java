package com.his.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.List;

public class Prescription {

  private long id;
  private long registerId;
  private long drugId;
  private String drugUsage;
  private String drugNumber;

  @JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss",timezone = "GMT+8")
  private java.sql.Timestamp creationTime;
  private String drugState;

  private String drugName;
  private String drugFormat;
  private double drugPrice;

  @Override
  public String toString() {
    return "Prescription{" +
            "id=" + id +
            ", registerId=" + registerId +
            ", drugId=" + drugId +
            ", drugUsage='" + drugUsage + '\'' +
            ", drugNumber='" + drugNumber + '\'' +
            ", creationTime=" + creationTime +
            ", drugState='" + drugState + '\'' +
            '}';
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

  public double getDrugPrice() {
    return drugPrice;
  }

  public void setDrugPrice(double drugPrice) {
    this.drugPrice = drugPrice;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getRegisterId() {
    return registerId;
  }

  public void setRegisterId(long registerId) {
    this.registerId = registerId;
  }


  public long getDrugId() {
    return drugId;
  }

  public void setDrugId(long drugId) {
    this.drugId = drugId;
  }


  public String getDrugUsage() {
    return drugUsage;
  }

  public void setDrugUsage(String drugUsage) {
    this.drugUsage = drugUsage;
  }


  public String getDrugNumber() {
    return drugNumber;
  }

  public void setDrugNumber(String drugNumber) {
    this.drugNumber = drugNumber;
  }


  public java.sql.Timestamp getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(java.sql.Timestamp creationTime) {
    this.creationTime = creationTime;
  }


  public String getDrugState() {
    return drugState;
  }

  public void setDrugState(String drugState) {
    this.drugState = drugState;
  }

}
