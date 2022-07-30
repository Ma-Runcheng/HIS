package com.his.pojo;


import com.fasterxml.jackson.annotation.JsonIgnore;

public class Scheduling {

  private long id;
  private String ruleName;
  private String weekRule;
  @JsonIgnore
  private long delmark;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getRuleName() {
    return ruleName;
  }

  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }


  public String getWeekRule() {
    return weekRule;
  }

  public void setWeekRule(String weekRule) {
    this.weekRule = weekRule;
  }


  public long getDelmark() {
    return delmark;
  }

  public void setDelmark(long delmark) {
    this.delmark = delmark;
  }

}
