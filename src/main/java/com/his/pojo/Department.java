package com.his.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public class Department {

  private long id;
  private String deptCode;
  private String deptName;
  private String deptType;
  @JsonIgnore
  private long delmark;

  private List<Employee> employeeList;

  public Department(long id, String deptCode, String deptName, String deptType) {
    this.id = id;
    this.deptCode = deptCode;
    this.deptName = deptName;
    this.deptType = deptType;
  }

  public List<Employee> getEmployeeList() {
    return employeeList;
  }

  public void setEmployeeList(List<Employee> employeeList) {
    this.employeeList = employeeList;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getDeptCode() {
    return deptCode;
  }

  public void setDeptCode(String deptCode) {
    this.deptCode = deptCode;
  }

  public String getDeptName() {
    return deptName;
  }

  public void setDeptName(String deptName) {
    this.deptName = deptName;
  }

  public String getDeptType() {
    return deptType;
  }

  public void setDeptType(String deptType) {
    this.deptType = deptType;
  }

  public long getDelmark() {
    return delmark;
  }

  public void setDelmark(long delmark) {
    this.delmark = delmark;
  }

  @Override
  public String toString() {
    return "Department{" +
            "id=" + id +
            ", deptCode='" + deptCode + '\'' +
            ", deptName='" + deptName + '\'' +
            ", deptType='" + deptType + '\'' +
            ", delmark=" + delmark +
            '}';
  }
}
