package com.timesaver.timesaver.domain;

import lombok.Data;

@Data
public class FinancialInstitutionDTO {

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
    private String imageName;
}
