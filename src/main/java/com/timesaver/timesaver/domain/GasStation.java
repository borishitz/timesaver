package com.timesaver.timesaver.domain;


import jakarta.persistence.*;

@Entity
@Table(name = "gasStation")
public class GasStation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

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





    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGasStationName() {
        return gasStationName;
    }

    public void setGasStationName(String gasStationName) {
        this.gasStationName = gasStationName;
    }

    public String getGasStationLocation() {
        return gasStationLocation;
    }

    public void setGasStationLocation(String gasStationLocation) {
        this.gasStationLocation = gasStationLocation;
    }

    public String getCityOrTown() {
        return cityOrTown;
    }

    public void setCityOrTown(String cityOrTown) {
        this.cityOrTown = cityOrTown;
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

    public String getGasStationPob() {
        return gasStationPob;
    }

    public void setGasStationPob(String gasStationPob) {
        this.gasStationPob = gasStationPob;
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


    public String getTelephone2() {
        return telephone2;
    }

    public void setTelephone2(String telephone2) {
        this.telephone2 = telephone2;
    }

    public String getDiesel() {
        return diesel;
    }

    public void setDiesel(String diesel) {
        this.diesel = diesel;
    }

    public String getKerosene() {
        return kerosene;
    }

    public void setKerosene(String kerosene) {
        this.kerosene = kerosene;
    }

    public String getCookingGas() {
        return cookingGas;
    }

    public void setCookingGas(String cookingGas) {
        this.cookingGas = cookingGas;
    }

    public String getStatus() {
        return status;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getYearsInService() {
        return yearsInService;
    }

    public void setYearsInService(String yearsInService) {
        this.yearsInService = yearsInService;
    }
}