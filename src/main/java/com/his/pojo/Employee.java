package com.his.pojo;


import com.fasterxml.jackson.annotation.JsonIgnore;

public class Employee {

  private long id;
  private String deptName;
  private String registName;
  private long schedulingId;
  private String realname;
  private String password;
  @JsonIgnore
  private long delmark;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getDeptName() {
    return deptName;
  }

  public void setDeptName(String deptName) {
    this.deptName = deptName;
  }


  public String getRegistName() {
    return registName;
  }

  public void setRegistName(String registName) {
    this.registName = registName;
  }


  public long getSchedulingId() {
    return schedulingId;
  }

  public void setSchedulingId(long schedulingId) {
    this.schedulingId = schedulingId;
  }


  public String getRealname() {
    return realname;
  }

  public void setRealname(String realname) {
    this.realname = realname;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public long getDelmark() {
    return delmark;
  }

  public void setDelmark(long delmark) {
    this.delmark = delmark;
  }

  @Override
  public String toString() {
    return "Employee{" +
            "id=" + id +
            ", deptName='" + deptName + '\'' +
            ", registName='" + registName + '\'' +
            ", schedulingId=" + schedulingId +
            ", realname='" + realname + '\'' +
            ", password='" + password + '\'' +
            ", delmark=" + delmark +
            '}';
  }
}
