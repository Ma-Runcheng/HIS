package com.his.pojo;


import com.fasterxml.jackson.annotation.JsonIgnore;

public class MedicalRecord {

  private long id;
  private long registerId;
  private String readme;
  private String present;
  private String presentTreat;
  private String history;
  private String allergy;
  private String physique;
  private String proposal;
  private String careful;
  private String diagnosis;
  private String cure;

  private Register register;

  @Override
  public String toString() {
    return "MedicalRecord{" +
            "id=" + id +
            ", registerId=" + registerId +
            ", readme='" + readme + '\'' +
            ", present='" + present + '\'' +
            ", presentTreat='" + presentTreat + '\'' +
            ", history='" + history + '\'' +
            ", allergy='" + allergy + '\'' +
            ", physique='" + physique + '\'' +
            ", proposal='" + proposal + '\'' +
            ", careful='" + careful + '\'' +
            ", diagnosis='" + diagnosis + '\'' +
            ", cure='" + cure + '\'' +
            '}';
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


  public String getReadme() {
    return readme;
  }

  public void setReadme(String readme) {
    this.readme = readme;
  }


  public String getPresent() {
    return present;
  }

  public void setPresent(String present) {
    this.present = present;
  }


  public String getPresentTreat() {
    return presentTreat;
  }

  public void setPresentTreat(String presentTreat) {
    this.presentTreat = presentTreat;
  }


  public String getHistory() {
    return history;
  }

  public void setHistory(String history) {
    this.history = history;
  }


  public String getAllergy() {
    return allergy;
  }

  public void setAllergy(String allergy) {
    this.allergy = allergy;
  }


  public String getPhysique() {
    return physique;
  }

  public void setPhysique(String physique) {
    this.physique = physique;
  }


  public String getProposal() {
    return proposal;
  }

  public void setProposal(String proposal) {
    this.proposal = proposal;
  }


  public String getCareful() {
    return careful;
  }

  public void setCareful(String careful) {
    this.careful = careful;
  }


  public String getDiagnosis() {
    return diagnosis;
  }

  public void setDiagnosis(String diagnosis) {
    this.diagnosis = diagnosis;
  }


  public String getCure() {
    return cure;
  }

  public void setCure(String cure) {
    this.cure = cure;
  }

}
