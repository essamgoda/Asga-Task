package com.essam.asga_task.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Color {

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("SpecificationAttributeId")
    @Expose
    private Integer specificationAttributeId;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("ColorSquaresRgb")
    @Expose
    private String colorSquaresRgb;
    @SerializedName("DisplayOrder")
    @Expose
    private Integer displayOrder;
    @SerializedName("SpecificationAttribute")
    @Expose
    private SpecificationAttribute specificationAttribute;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSpecificationAttributeId() {
        return specificationAttributeId;
    }

    public void setSpecificationAttributeId(Integer specificationAttributeId) {
        this.specificationAttributeId = specificationAttributeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColorSquaresRgb() {
        return colorSquaresRgb;
    }

    public void setColorSquaresRgb(String colorSquaresRgb) {
        this.colorSquaresRgb = colorSquaresRgb;
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public SpecificationAttribute getSpecificationAttribute() {
        return specificationAttribute;
    }

    public void setSpecificationAttribute(SpecificationAttribute specificationAttribute) {
        this.specificationAttribute = specificationAttribute;
    }

}
