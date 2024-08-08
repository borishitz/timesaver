package com.timesaver.timesaver.domain;


import jakarta.persistence.*;

@Entity
@Table(name = "clinic")

public class Clinic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    private String clinicName;
    private String clinicLocation;
    private String cityOrTown;
    private String managersName;
    private String address;
    private String clinicPob;
    private String telephone;
    private String telephone2;
    private String email;
    private String lat;
    private String lng;
    private String openTime;
    private String closeTime;
    private String status;
    private String notes;
    private String Dermato;
    private String Ophthalmo;
    private String license;
    private String Surge;
    private String yearsOfExperience;
//    private String stars;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    public String getClinicLocation() {
        return clinicLocation;
    }

    public void setClinicLocation(String clinicLocation) {
        this.clinicLocation = clinicLocation;
    }

    public String getCityOrTown() {
        return cityOrTown;
    }

    public void setCityOrTown(String cityOrTown) {
        this.cityOrTown = cityOrTown;
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

    public String getClinicPob() {
        return clinicPob;
    }

    public void setClinicPob(String clinicPob) {
        this.clinicPob = clinicPob;
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

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }


    public String getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(String yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTelephone2() {
        return telephone2;
    }

    public void setTelephone2(String telephone2) {
        this.telephone2 = telephone2;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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

    public String getDermato() {
        return Dermato;
    }

    public void setDermato(String dermato) {
        Dermato = dermato;
    }

    public String getOphthalmo() {
        return Ophthalmo;
    }

    public void setOphthalmo(String ophthalmo) {
        Ophthalmo = ophthalmo;
    }

    public String getSurge() {
        return Surge;
    }

    public void setSurge(String surge) {
        Surge = surge;
    }
}
