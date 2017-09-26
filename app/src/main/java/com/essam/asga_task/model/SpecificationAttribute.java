package com.essam.asga_task.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Essam on 9/26/2017.
 */
public class SpecificationAttribute {

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("DisplayOrder")
    @Expose
    private Integer displayOrder;
    @SerializedName("SpecificationAttributeOptions")
    @Expose
    private List<Object> specificationAttributeOptions = null;

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

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public List<Object> getSpecificationAttributeOptions() {
        return specificationAttributeOptions;
    }

    public void setSpecificationAttributeOptions(List<Object> specificationAttributeOptions) {
        this.specificationAttributeOptions = specificationAttributeOptions;
    }

}
