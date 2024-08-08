package com.timesaver.timesaver.domain;

import lombok.Data;

@Data
public class SchoolDTO {
    public Long id;

    private String schoolName;
    private String schoolLocation;
    private String cityOrTown;
    private String proName;
    private String levels;
    private String lat;
    private String lng;
    private String address;
    private String telephone;
    private String telephone2;
    private String email;
    private String schoolOpenTime;
    private String schoolCloseTime;
    private String openTime;
    private String openTimePrinHead;
    private String closeTime;
    private String closeTimePrinHead;
    private String specialty;
    private String license;
    private String nursery;
//    private String primary;
    private String secondary;
    private String highSchool;
    private String notes;
    private String status;
    private String addHours;
    private String closeHours;
    public String yearEstablished;
    private String pob;
    private String highestDiploma;
    private String yearsInExistence;
    private String stars;
    private String imageName;
}
