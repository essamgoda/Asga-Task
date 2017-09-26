package com.essam.asga_task.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Essam on 9/26/2017.
 */
public class Family {

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("CustomerId")
    @Expose
    private Integer customerId;
    @SerializedName("CharityId")
    @Expose
    private Integer charityId;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Email")
    @Expose
    private String email;
    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("ImageURL")
    @Expose
    private String imageURL;
    @SerializedName("PictureId")
    @Expose
    private Integer pictureId;
    @SerializedName("AddressId")
    @Expose
    private Integer addressId;
    @SerializedName("AdminComment")
    @Expose
    private Object adminComment;
    @SerializedName("Active")
    @Expose
    private Boolean active;
    @SerializedName("Deleted")
    @Expose
    private Boolean deleted;
    @SerializedName("DeliveryPossibilityId")
    @Expose
    private Object deliveryPossibilityId;
    @SerializedName("DisplayOrder")
    @Expose
    private Integer displayOrder;
    @SerializedName("MetaKeywords")
    @Expose
    private Object metaKeywords;
    @SerializedName("MetaDescription")
    @Expose
    private Object metaDescription;
    @SerializedName("MetaTitle")
    @Expose
    private Object metaTitle;
    @SerializedName("PageSize")
    @Expose
    private Integer pageSize;
    @SerializedName("AllowCustomersToSelectPageSize")
    @Expose
    private Boolean allowCustomersToSelectPageSize;
    @SerializedName("PageSizeOptions")
    @Expose
    private String pageSizeOptions;
    @SerializedName("ShopName")
    @Expose
    private String shopName;
    @SerializedName("Address")
    @Expose
    private Address address;
    @SerializedName("Customer")
    @Expose
    private Customer customer;
    @SerializedName("Charity")
    @Expose
    private Charity charity;
    @SerializedName("UserRegisteration")
    @Expose
    private UserRegisteration userRegisteration;
    @SerializedName("VendorNotes")
    @Expose
    private List<Object> vendorNotes = null;
    @SerializedName("VendorReviews")
    @Expose
    private List<Object> vendorReviews = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getCharityId() {
        return charityId;
    }

    public void setCharityId(Integer charityId) {
        this.charityId = charityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public Integer getPictureId() {
        return pictureId;
    }

    public void setPictureId(Integer pictureId) {
        this.pictureId = pictureId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Object getAdminComment() {
        return adminComment;
    }

    public void setAdminComment(Object adminComment) {
        this.adminComment = adminComment;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Object getDeliveryPossibilityId() {
        return deliveryPossibilityId;
    }

    public void setDeliveryPossibilityId(Object deliveryPossibilityId) {
        this.deliveryPossibilityId = deliveryPossibilityId;
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public Object getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(Object metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    public Object getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(Object metaDescription) {
        this.metaDescription = metaDescription;
    }

    public Object getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(Object metaTitle) {
        this.metaTitle = metaTitle;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Boolean getAllowCustomersToSelectPageSize() {
        return allowCustomersToSelectPageSize;
    }

    public void setAllowCustomersToSelectPageSize(Boolean allowCustomersToSelectPageSize) {
        this.allowCustomersToSelectPageSize = allowCustomersToSelectPageSize;
    }

    public String getPageSizeOptions() {
        return pageSizeOptions;
    }

    public void setPageSizeOptions(String pageSizeOptions) {
        this.pageSizeOptions = pageSizeOptions;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Charity getCharity() {
        return charity;
    }

    public void setCharity(Charity charity) {
        this.charity = charity;
    }

    public UserRegisteration getUserRegisteration() {
        return userRegisteration;
    }

    public void setUserRegisteration(UserRegisteration userRegisteration) {
        this.userRegisteration = userRegisteration;
    }

    public List<Object> getVendorNotes() {
        return vendorNotes;
    }

    public void setVendorNotes(List<Object> vendorNotes) {
        this.vendorNotes = vendorNotes;
    }

    public List<Object> getVendorReviews() {
        return vendorReviews;
    }

    public void setVendorReviews(List<Object> vendorReviews) {
        this.vendorReviews = vendorReviews;
    }

}
