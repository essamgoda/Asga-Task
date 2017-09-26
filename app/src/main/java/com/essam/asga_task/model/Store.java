package com.essam.asga_task.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Store {

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Url")
    @Expose
    private String url;
    @SerializedName("SslEnabled")
    @Expose
    private Boolean sslEnabled;
    @SerializedName("SecureUrl")
    @Expose
    private Object secureUrl;
    @SerializedName("Hosts")
    @Expose
    private String hosts;
    @SerializedName("DefaultLanguageId")
    @Expose
    private Integer defaultLanguageId;
    @SerializedName("DisplayOrder")
    @Expose
    private Integer displayOrder;
    @SerializedName("CompanyName")
    @Expose
    private String companyName;
    @SerializedName("CompanyAddress")
    @Expose
    private String companyAddress;
    @SerializedName("CompanyPhoneNumber")
    @Expose
    private Object companyPhoneNumber;
    @SerializedName("CompanyVat")
    @Expose
    private Object companyVat;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getSslEnabled() {
        return sslEnabled;
    }

    public void setSslEnabled(Boolean sslEnabled) {
        this.sslEnabled = sslEnabled;
    }

    public Object getSecureUrl() {
        return secureUrl;
    }

    public void setSecureUrl(Object secureUrl) {
        this.secureUrl = secureUrl;
    }

    public String getHosts() {
        return hosts;
    }

    public void setHosts(String hosts) {
        this.hosts = hosts;
    }

    public Integer getDefaultLanguageId() {
        return defaultLanguageId;
    }

    public void setDefaultLanguageId(Integer defaultLanguageId) {
        this.defaultLanguageId = defaultLanguageId;
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public Object getCompanyPhoneNumber() {
        return companyPhoneNumber;
    }

    public void setCompanyPhoneNumber(Object companyPhoneNumber) {
        this.companyPhoneNumber = companyPhoneNumber;
    }

    public Object getCompanyVat() {
        return companyVat;
    }

    public void setCompanyVat(Object companyVat) {
        this.companyVat = companyVat;
    }

}
