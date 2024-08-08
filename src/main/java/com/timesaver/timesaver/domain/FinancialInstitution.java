package com.timesaver.timesaver.domain;


import jakarta.persistence.*;

@Entity
@Table(name = "financialInstitution")

public class FinancialInstitution {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    public Long id;
    private String microFinanceName;
    private String microFinanceAddress;
    private String cityOrTown;
    private String pob;
    private String lat;
    private String lng;
    private String managersName;
    private String address;
    private String telephone;
    private String telephone2;
    private String email;
    private String openTime;
    private String closeTime;
    private String satOpens;
    private String satClose;
    private String branches;
    private String notes;
    private String onlineBanking;
    private String businessAcct;
    private String moneyTransfer;
    private String cashPick;
    private String services;
    private String license;
    private String status;
    private String yearsInExistence;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMicroFinanceName() {
        return microFinanceName;
    }

    public void setMicroFinanceName(String microFinanceName) {
        this.microFinanceName = microFinanceName;
    }

    public String getMicroFinanceAddress() {
        return microFinanceAddress;
    }

    public void setMicroFinanceAddress(String microFinanceAddress) {
        this.microFinanceAddress = microFinanceAddress;
    }

    public String getCityOrTown() {
        return cityOrTown;
    }

    public void setCityOrTown(String cityOrTown) {
        this.cityOrTown = cityOrTown;
    }

    public String getPob() {
        return pob;
    }

    public void setPob(String pob) {
        this.pob = pob;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getManagersName() {
        return managersName;
    }

    public void setManagersName(String managersName) {
        this.managersName = managersName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public String getSatOpens() {
        return satOpens;
    }

    public void setSatOpens(String satOpens) {
        this.satOpens = satOpens;
    }

    public String getSatClose() {
        return satClose;
    }

    public void setSatClose(String satClose) {
        this.satClose = satClose;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }


    public String getYearsInExistence() {
        return yearsInExistence;
    }

    public void setYearsInExistence(String yearsInExistence) {
        this.yearsInExistence = yearsInExistence;
    }

    public String getTelephone2() {
        return telephone2;
    }

    public void setTelephone2(String telephone2) {
        this.telephone2 = telephone2;
    }

    public String getBranches() {
        return branches;
    }

    public void setBranches(String branches) {
        this.branches = branches;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getOnlineBanking() {
        return onlineBanking;
    }

    public void setOnlineBanking(String onlineBanking) {
        this.onlineBanking = onlineBanking;
    }

    public String getBusinessAcct() {
        return businessAcct;
    }

    public void setBusinessAcct(String businessAcct) {
        this.businessAcct = businessAcct;
    }

    public String getMoneyTransfer() {
        return moneyTransfer;
    }

    public void setMoneyTransfer(String moneyTransfer) {
        this.moneyTransfer = moneyTransfer;
    }

    public String getCashPick() {
        return cashPick;
    }

    public void setCashPick(String cashPick) {
        this.cashPick = cashPick;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }
}
