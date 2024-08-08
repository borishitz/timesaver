package com.timesaver.timesaver.domain;

import lombok.Data;

@Data
public class TravelAgencyDTO {
    public Long id;
    private String agencyName;
    private String agencyLocation;
    private String cityOrTown;
    private String proName;
    private String mangerName;
    private String lat;
    private String lng;
    private String telephone;
    private String telephone2;
    private String email;
    private String agencyOpenTime;
    private String agencyCloseTime;
    private String services;
    private String license;
    private String status;
    private String pob;
    private String yearsInExistence;
    private String imageName;
}
