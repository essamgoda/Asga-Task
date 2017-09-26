package com.essam.asga_task.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Customer {

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("UserId")
    @Expose
    private Integer userId;
    @SerializedName("CountryId")
    @Expose
    private Object countryId;
    @SerializedName("Email")
    @Expose
    private Object email;
    @SerializedName("Username")
    @Expose
    private Object username;
    @SerializedName("Image")
    @Expose
    private Object image;
    @SerializedName("PhoneNumber")
    @Expose
    private Object phoneNumber;
    @SerializedName("DeviceToken")
    @Expose
    private Object deviceToken;
    @SerializedName("ServiceProvider")
    @Expose
    private Object serviceProvider;
    @SerializedName("UserLocation")
    @Expose
    private Object userLocation;
    @SerializedName("UserGender")
    @Expose
    private Object userGender;
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

    public Object getCountryId() {
        return countryId;
    }

    public void setCountryId(Object countryId) {
        this.countryId = countryId;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }

    public Object getUsername() {
        return username;
    }

    public void setUsername(Object username) {
        this.username = username;
    }

    public Object getImage() {
        return image;
    }

    public void setImage(Object image) {
        this.image = image;
    }

    public Object getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Object phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Object getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(Object deviceToken) {
        this.deviceToken = deviceToken;
    }

    public Object getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(Object serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public Object getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(Object userLocation) {
        this.userLocation = userLocation;
    }

    public Object getUserGender() {
        return userGender;
    }

    public void setUserGender(Object userGender) {
        this.userGender = userGender;
    }

    public Object getDoB() {
        return doB;
    }

    public void setDoB(Object doB) {
        this.doB = doB;
    }

}
