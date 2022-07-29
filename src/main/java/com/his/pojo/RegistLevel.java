package com.his.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class RegistLevel {

  private long id;
  private String registCode;
  private String registName;
  private double registFee;
  private long registQuota;
  private long sequenceNo;
  @JsonIgnore
  private long delmark;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getRegistCode() {
    return registCode;
  }

  public void setRegistCode(String registCode) {
    this.registCode = registCode;
  }


  public String getRegistName() {
    return registName;
  }

  public void setRegistName(String registName) {
    this.registName = registName;
  }


  public double getRegistFee() {
    return registFee;
  }

  public void setRegistFee(double registFee) {
    this.registFee = registFee;
  }


  public long getRegistQuota() {
    return registQuota;
  }

  public void setRegistQuota(long registQuota) {
    this.registQuota = registQuota;
  }


  public long getSequenceNo() {
    return sequenceNo;
  }

  public void setSequenceNo(long sequenceNo) {
    this.sequenceNo = sequenceNo;
  }


  public long getDelmark() {
    return delmark;
  }

  public void setDelmark(long delmark) {
    this.delmark = delmark;
  }

  @Override
  public String toString() {
    return "RegistLevel{" +
            "id=" + id +
            ", registCode='" + registCode + '\'' +
            ", registName='" + registName + '\'' +
            ", registFee=" + registFee +
            ", registQuota=" + registQuota +
            ", sequenceNo=" + sequenceNo +
            ", delmark=" + delmark +
            '}';
  }
}
