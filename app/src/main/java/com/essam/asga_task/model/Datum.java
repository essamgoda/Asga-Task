package com.essam.asga_task.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Essam on 9/26/2017.
 */

public class Datum {

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("IsReviewedByCurrentUser")
    @Expose
    private Boolean isReviewedByCurrentUser;
    @SerializedName("FamilyId")
    @Expose
    private Integer familyId;
    @SerializedName("Image")
    @Expose
    private String image;
    @SerializedName("Family")
    @Expose
    private Family family;
    @SerializedName("CategoryId")
    @Expose
    private Integer categoryId;
    @SerializedName("SubCategoryId")
    @Expose
    private Integer subCategoryId;
    @SerializedName("SectionId")
    @Expose
    private Integer sectionId;
    @SerializedName("NameEn")
    @Expose
    private String nameEn;
    @SerializedName("DescriptionEn")
    @Expose
    private String descriptionEn;
    @SerializedName("CategoryName")
    @Expose
    private String categoryName;
    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Material")
    @Expose
    private String material;
    @SerializedName("QuantityInStock")
    @Expose
    private Integer quantityInStock;
    @SerializedName("OverallRate")
    @Expose
    private Integer overallRate;
    @SerializedName("Quantity")
    @Expose
    private Integer quantity;
    @SerializedName("Price")
    @Expose
    private Double price;
    @SerializedName("PriceAfterDiscount")
    @Expose
    private Double priceAfterDiscount;
    @SerializedName("IsFavorait")
    @Expose
    private Boolean isFavorait;
    @SerializedName("StartColorCode")
    @Expose
    private String startColorCode;
    @SerializedName("ProductUrlForShare")
    @Expose
    private String productUrlForShare;
    @SerializedName("IsAddedToCart")
    @Expose
    private Boolean isAddedToCart;
    @SerializedName("Sizes")
    @Expose
    private List<Object> sizes = null;
    @SerializedName("Colors")
    @Expose
    private List<Color> colors = null;
    @SerializedName("ProductPictures")
    @Expose
    private List<ProductPicture> productPictures = null;
    @SerializedName("SelectedSpecifications")
    @Expose
    private List<Object> selectedSpecifications = null;
    @SerializedName("ProductReviews")
    @Expose
    private List<ProductReview> productReviews = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getIsReviewedByCurrentUser() {
        return isReviewedByCurrentUser;
    }

    public void setIsReviewedByCurrentUser(Boolean isReviewedByCurrentUser) {
        this.isReviewedByCurrentUser = isReviewedByCurrentUser;
    }

    public Integer getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Integer familyId) {
        this.familyId = familyId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(Integer subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public Integer getSectionId() {
        return sectionId;
    }

    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Integer quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public Integer getOverallRate() {
        return overallRate;
    }

    public void setOverallRate(Integer overallRate) {
        this.overallRate = overallRate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPriceAfterDiscount() {
        return priceAfterDiscount;
    }

    public void setPriceAfterDiscount(Double priceAfterDiscount) {
        this.priceAfterDiscount = priceAfterDiscount;
    }

    public Boolean getIsFavorait() {
        return isFavorait;
    }

    public void setIsFavorait(Boolean isFavorait) {
        this.isFavorait = isFavorait;
    }

    public String getStartColorCode() {
        return startColorCode;
    }

    public void setStartColorCode(String startColorCode) {
        this.startColorCode = startColorCode;
    }

    public String getProductUrlForShare() {
        return productUrlForShare;
    }

    public void setProductUrlForShare(String productUrlForShare) {
        this.productUrlForShare = productUrlForShare;
    }

    public Boolean getIsAddedToCart() {
        return isAddedToCart;
    }

    public void setIsAddedToCart(Boolean isAddedToCart) {
        this.isAddedToCart = isAddedToCart;
    }

    public List<Object> getSizes() {
        return sizes;
    }

    public void setSizes(List<Object> sizes) {
        this.sizes = sizes;
    }

    public List<Color> getColors() {
        return colors;
    }

    public void setColors(List<Color> colors) {
        this.colors = colors;
    }

    public List<ProductPicture> getProductPictures() {
        return productPictures;
    }

    public void setProductPictures(List<ProductPicture> productPictures) {
        this.productPictures = productPictures;
    }

    public List<Object> getSelectedSpecifications() {
        return selectedSpecifications;
    }

    public void setSelectedSpecifications(List<Object> selectedSpecifications) {
        this.selectedSpecifications = selectedSpecifications;
    }

    public List<ProductReview> getProductReviews() {
        return productReviews;
    }

    public void setProductReviews(List<ProductReview> productReviews) {
        this.productReviews = productReviews;
    }

}