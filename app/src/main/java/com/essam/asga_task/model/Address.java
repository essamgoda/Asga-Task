package com.essam.asga_task.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Address {

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("Company")
    @Expose
    private Object company;
    @SerializedName("CountryId")
    @Expose
    private Object countryId;
    @SerializedName("City")
    @Expose
    private Object city;
    @SerializedName("Address1")
    @Expose
    private Object address1;
    @SerializedName("Address2")
    @Expose
    private Object address2;
    @SerializedName("RegionId")
    @Expose
    private Object regionId;
    @SerializedName("BuildingNo")
    @Expose
    private Object buildingNo;
    @SerializedName("Latitude")
    @Expose
    private Object latitude;
    @SerializedName("Longitude")
    @Expose
    private Object longitude;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object getCompany() {
        return company;
    }

    public void setCompany(Object company) {
        this.company = company;
    }

    public Object getCountryId() {
        return countryId;
    }

    public void setCountryId(Object countryId) {
        this.countryId = countryId;
    }

    public Object getCity() {
        return city;
    }

    public void setCity(Object city) {
        this.city = city;
    }

    public Object getAddress1() {
        return address1;
    }

    public void setAddress1(Object address1) {
        this.address1 = address1;
    }

    public Object getAddress2() {
        return address2;
    }

    public void setAddress2(Object address2) {
        this.address2 = address2;
    }

    public Object getRegionId() {
        return regionId;
    }

    public void setRegionId(Object regionId) {
        this.regionId = regionId;
    }

    public Object getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(Object buildingNo) {
        this.buildingNo = buildingNo;
    }

    public Object getLatitude() {
        return latitude;
    }

    public void setLatitude(Object latitude) {
        this.latitude = latitude;
    }

    public Object getLongitude() {
        return longitude;
    }

    public void setLongitude(Object longitude) {
        this.longitude = longitude;
    }

}
