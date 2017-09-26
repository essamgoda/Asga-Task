package com.essam.asga_task.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Picture {

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("ImageURL")
    @Expose
    private String imageURL;
    @SerializedName("MimeType")
    @Expose
    private String mimeType;
    @SerializedName("SeoFilename")
    @Expose
    private String seoFilename;
    @SerializedName("AltAttribute")
    @Expose
    private Object altAttribute;
    @SerializedName("TitleAttribute")
    @Expose
    private Object titleAttribute;
    @SerializedName("IsNew")
    @Expose
    private Boolean isNew;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getSeoFilename() {
        return seoFilename;
    }

    public void setSeoFilename(String seoFilename) {
        this.seoFilename = seoFilename;
    }

    public Object getAltAttribute() {
        return altAttribute;
    }

    public void setAltAttribute(Object altAttribute) {
        this.altAttribute = altAttribute;
    }

    public Object getTitleAttribute() {
        return titleAttribute;
    }

    public void setTitleAttribute(Object titleAttribute) {
        this.titleAttribute = titleAttribute;
    }

    public Boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

}
