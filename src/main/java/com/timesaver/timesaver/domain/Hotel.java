package com.timesaver.timesaver.domain;


import jakarta.persistence.*;

@Entity
@Table(name = "hotel")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    public Long id;
    private String hotelName;
    private String hotelLocation;
    private String cityOrTown;
    private String lat;
    private String lng;
    private String managersName;
    private String telephone;
    private String telephone2;
    private String email;
    private String website;
    private String numberOfRooms;
    private String swimmingPool;
    private String freeWifi;
    private String barAndResto;
    private String carRental;
    private String officeSpace;
    private String jim;
    private String openTime;
    private String closeTime;
    private String status;
    private String priceRange;
    private String notes;
    private String europeanDishes;
    private String africanDishes;
    private String americanDishes;
    private String logo;
    private String typesOfDishes;
    private String hotelPob;
    private String yearsInExistence;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelLocation() {
        return hotelLocation;
    }

    public void setHotelLocation(String hotelLocation) {
        this.hotelLocation = hotelLocation;
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

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getNumberOfRooms() {
        return numberOfRooms;
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

    public void setNumberOfRooms(String numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }


    public String getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange;
    }

    public String getSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(String swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public String getFreeWifi() {
        return freeWifi;
    }

    public void setFreeWifi(String freeWifi) {
        this.freeWifi = freeWifi;
    }

    public String getBarAndResto() {
        return barAndResto;
    }

    public void setBarAndResto(String barAndResto) {
        this.barAndResto = barAndResto;
    }

    public String getCarRental() {
        return carRental;
    }

    public void setCarRental(String carRental) {
        this.carRental = carRental;
    }

    public String getOfficeSpace() {
        return officeSpace;
    }

    public void setOfficeSpace(String officeSpace) {
        this.officeSpace = officeSpace;
    }

    public String getJim() {
        return jim;
    }

    public void setJim(String jim) {
        this.jim = jim;
    }

    public String getOpenTime() {
        return openTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getTypesOfDishes() {
        return typesOfDishes;
    }

    public void setTypesOfDishes(String typesOfDishes) {
        this.typesOfDishes = typesOfDishes;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getEuropeanDishes() {
        return europeanDishes;
    }

    public void setEuropeanDishes(String europeanDishes) {
        this.europeanDishes = europeanDishes;
    }

    public String getAfricanDishes() {
        return africanDishes;
    }

    public void setAfricanDishes(String africanDishes) {
        this.africanDishes = africanDishes;
    }

    public String getAmericanDishes() {
        return americanDishes;
    }

    public void setAmericanDishes(String americanDishes) {
        this.americanDishes = americanDishes;
    }

    public String getHotelPob() {
        return hotelPob;
    }

    public void setHotelPob(String hotelPob) {
        this.hotelPob = hotelPob;
    }

    public String getYearsInExistence() {
        return yearsInExistence;
    }

    public void setYearsInExistence(String yearsInExistence) {
        this.yearsInExistence = yearsInExistence;
    }
}




