package com.timesaver.timesaver.domain;


import jakarta.persistence.*;

@Entity
@Table(name = "repairer")
public class Repairer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    //    @Column(unique = true)
    private String repairerName;
    private String service;
    private String repairerLocation;
    private String cityOrTown;
//    private String levels;
//    private String lat;
//    private String lng;
//    private String address;
    private String telephone;
    private String telephone2;
    private String email;
    private String repOpenTime;
    private String repCloseTime;
//    private String openTime;
//    private String openTimePrinHead;
//    private String closeTime;
//    private String closeTimePrinHead;
//    private String specialty;
//    private String license;
//    private String notes;
    private String status;
    private String addHours;
    private String closeHours;
    private String projCompleted;
    private String yearOfExp;
    private String pob;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRepairerName() {
        return repairerName;
    }

    public void setRepairerName(String repairerName) {
        this.repairerName = repairerName;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getRepairerLocation() {
        return repairerLocation;
    }

    public void setRepairerLocation(String repairerLocation) {
        this.repairerLocation = repairerLocation;
    }

    public String getCityOrTown() {
        return cityOrTown;
    }

    public void setCityOrTown(String cityOrTown) {
        this.cityOrTown = cityOrTown;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTelephone2() {
        return telephone2;
    }

    public void setTelephone2(String telephone2) {
        this.telephone2 = telephone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRepOpenTime() {
        return repOpenTime;
    }

    public void setRepOpenTime(String repOpenTime) {
        this.repOpenTime = repOpenTime;
    }

    public String getRepCloseTime() {
        return repCloseTime;
    }

    public void setRepCloseTime(String repCloseTime) {
        this.repCloseTime = repCloseTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddHours() {
        return addHours;
    }

    public void setAddHours(String addHours) {
        this.addHours = addHours;
    }

    public String getCloseHours() {
        return closeHours;
    }

    public void setCloseHours(String closeHours) {
        this.closeHours = closeHours;
    }

    public String getProjCompleted() {
        return projCompleted;
    }

    public void setProjCompleted(String projCompleted) {
        this.projCompleted = projCompleted;
    }

    public String getYearOfExp() {
        return yearOfExp;
    }

    public void setYearOfExp(String yearOfExp) {
        this.yearOfExp = yearOfExp;
    }

    public String getPob() {
        return pob;
    }

    public void setPob(String pob) {
        this.pob = pob;
    }
}
