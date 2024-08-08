package com.timesaver.timesaver.domain;

import lombok.Data;

@Data
public class PharmacyDTO {

    public Long id;
    private String pharmacyName;
    private String pharmacyLocation;
    private String cityOrTown;
    private String pharmacyPob;
    private String lat;
    private String lng;
    private String managersName;
    private String address;
    private String telephone;
    private String telephone2;
    private String email;
    private String openTime;
    private String closeTime;
    private String vaccinations;
    private String salesMedi;
    private String genConsult;
    private String prescription;
    private String status;
    private String disclaimer;
    private String license;
    private String notes;
    private String highestDiploma;
    private String yearsOfExperience;
    private String stars;
    private String imageName;

}
