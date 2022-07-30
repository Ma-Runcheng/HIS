package com.his.pojo;


import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Employee {

  private long id;
  private long deptmentId;
  private long registLevelId;
  private long schedulingId;
  private String realname;
  private String password;
  @JsonIgnore
  private long delmark;
  private Department department;
  private RegistLevel registLevel;
  private Scheduling scheduling;

  public Scheduling getScheduling() {
    return scheduling;
  }

  public void setScheduling(Scheduling scheduling) {
    this.scheduling = scheduling;
  }

  public RegistLevel getRegistLevel() {
    return registLevel;
  }

  public void setRegistLevel(RegistLevel registLevel) {
    this.registLevel = registLevel;
  }

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


  public long getDeptmentId() {
    return deptmentId;
  }

  public void setDeptmentId(long deptmentId) {
    this.deptmentId = deptmentId;
  }


  public long getRegistLevelId() {
    return registLevelId;
  }

  public void setRegistLevelId(long registLevelId) {
    this.registLevelId = registLevelId;
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
            ", deptmentId=" + deptmentId +
            ", registLevelId=" + registLevelId +
            ", schedulingId=" + schedulingId +
            ", realname='" + realname + '\'' +
            ", password='" + password + '\'' +
            ", delmark=" + delmark +
            ", department=" + department +
            '}';
  }
}
