package com.timesaver.timesaver.domain;


import jakarta.persistence.*;

@Entity
@Table(name = "school")
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    //    @Column(unique = true)
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
//    private String telephone3;
    private String email;
    private String schoolOpenTime;
    private String schoolCloseTime;
    private String openTime;
    private String openTimePrinHead;
    private String closeTime;
    private String closeTimePrinHead;
    private String specialty;
    private String license;
    private String notes;
    private String status;
    private String addHours;
    private String closeHours;
    public String yearEstablished;
    private String pob;
    //    private String credit;
    private String highestDiploma;
    private String yearsInExistence;
    private String stars;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolLocation() {
        return schoolLocation;
    }

    public void setSchoolLocation(String schoolLocation) {
        this.schoolLocation = schoolLocation;
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

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getLevels() {
        return levels;
    }

    public void setLevels(String levels) {
        this.levels = levels;
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

    public void setTelephone(String telephone1) {
        this.telephone = telephone1;
    }

    public String getTelephone2() {
        return telephone2;
    }

    public void setTelephone2(String telephone2) {
        this.telephone2 = telephone2;
    }

//    public String getImage() {
//        return image;
//    }
//
//    public void setImage(String image) {
//        this.image = image;
//    }


    public String getYearEstablished() {
        return yearEstablished;
    }

    public void setYearEstablished(String yearEstablished) {
        this.yearEstablished = yearEstablished;
    }

    public String getPob() {
        return pob;
    }

    public void setPob(String pob) {
        this.pob = pob;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSchoolOpenTime() {
        return schoolOpenTime;
    }

    public void setSchoolOpenTime(String schoolOpenTime) {
        this.schoolOpenTime = schoolOpenTime;
    }

    public String getSchoolCloseTime() {
        return schoolCloseTime;
    }

    public void setSchoolCloseTime(String schoolCloseTime) {
        this.schoolCloseTime = schoolCloseTime;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getOpenTimePrinHead() {
        return openTimePrinHead;
    }

    public void setOpenTimePrinHead(String openTimePrinHead) {
        this.openTimePrinHead = openTimePrinHead;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public String getCloseTimePrinHead() {
        return closeTimePrinHead;
    }

    public void setCloseTimePrinHead(String closeTimePrinHead) {
        this.closeTimePrinHead = closeTimePrinHead;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getStatus() {
        return status;
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

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }


    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getHighestDiploma() {
        return highestDiploma;
    }

    public void setHighestDiploma(String highestDiploma) {
        this.highestDiploma = highestDiploma;
    }

    public String getYearsInExistence() {
        return yearsInExistence;
    }

    public void setYearsInExistence(String yearsInExistence) {
        this.yearsInExistence = yearsInExistence;
    }
}
