package com.essam.asga_task.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserRegisteration {

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("Email")
    @Expose
    private Object email;
    @SerializedName("UserGender")
    @Expose
    private Boolean userGender;
    @SerializedName("UserName")
    @Expose
    private Object userName;
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
    @SerializedName("Password")
    @Expose
    private Object password;
    @SerializedName("ConfirmPassword")
    @Expose
    private Object confirmPassword;
    @SerializedName("CountryId")
    @Expose
    private Object countryId;
    @SerializedName("DoB")
    @Expose
    private Object doB;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }

    public Boolean getUserGender() {
        return userGender;
    }

    public void setUserGender(Boolean userGender) {
        this.userGender = userGender;
    }

    public Object getUserName() {
        return userName;
    }

    public void setUserName(Object userName) {
        this.userName = userName;
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

    public Object getPassword() {
        return password;
    }

    public void setPassword(Object password) {
        this.password = password;
    }

    public Object getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(Object confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public Object getCountryId() {
        return countryId;
    }

    public void setCountryId(Object countryId) {
        this.countryId = countryId;
    }

    public Object getDoB() {
        return doB;
    }

    public void setDoB(Object doB) {
        this.doB = doB;
    }

}
