package com.essam.asga_task.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Customer_ {

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("UserId")
    @Expose
    private Integer userId;
    @SerializedName("CountryId")
    @Expose
    private Integer countryId;
    @SerializedName("Email")
    @Expose
    private String email;
    @SerializedName("Username")
    @Expose
    private String username;
    @SerializedName("Image")
    @Expose
    private String image;
    @SerializedName("PhoneNumber")
    @Expose
    private String phoneNumber;
    @SerializedName("DeviceToken")
    @Expose
    private String deviceToken;
    @SerializedName("ServiceProvider")
    @Expose
    private String serviceProvider;
    @SerializedName("UserLocation")
    @Expose
    private Object userLocation;
    @SerializedName("UserGender")
    @Expose
    private Boolean userGender;
    @SerializedName("DoB")
    @Expose
    private Object doB;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    public String getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public Object getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(Object userLocation) {
        this.userLocation = userLocation;
    }

    public Boolean getUserGender() {
        return userGender;
    }

    public void setUserGender(Boolean userGender) {
        this.userGender = userGender;
    }

    public Object getDoB() {
        return doB;
    }

    public void setDoB(Object doB) {
        this.doB = doB;
    }

}
