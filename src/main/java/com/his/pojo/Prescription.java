package com.his.pojo;


public class Prescription {

  private long id;
  private long registerId;
  private long drugId;
  private String drugUsage;
  private String drugNumber;
  private java.sql.Timestamp creationTime;
  private String drugState;


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
