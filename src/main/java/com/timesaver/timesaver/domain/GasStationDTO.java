package com.timesaver.timesaver.domain;

import lombok.Data;

@Data
public class GasStationDTO {
    public Long id;

    private String gasStationName;
    private String gasStationLocation;
    private String cityOrTown;
    private String lat;
    private String lng;
    private String managersName;
    private String address;
    private String gasStationPob;
    private String telephone;
    private String telephone2;
    private String email;
    private String openTime;
    private String closeTime;
    private String diesel;
    private String kerosene;
    private String cookingGas;
    private String status;
    private String license;
    private String notes;
    private String yearsInService;
    private String imageName;
}
