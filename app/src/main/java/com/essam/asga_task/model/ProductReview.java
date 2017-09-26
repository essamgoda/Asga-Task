package com.essam.asga_task.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Essam on 9/26/2017.
 */
public class ProductReview {

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("CustomerId")
    @Expose
    private Integer customerId;
    @SerializedName("WhatsGood")
    @Expose
    private Object whatsGood;
    @SerializedName("WhatsBad")
    @Expose
    private Object whatsBad;
    @SerializedName("ProductId")
    @Expose
    private Integer productId;
    @SerializedName("StoreId")
    @Expose
    private Integer storeId;
    @SerializedName("IsApproved")
    @Expose
    private Boolean isApproved;
    @SerializedName("Title")
    @Expose
    private Object title;
    @SerializedName("ReviewText")
    @Expose
    private Object reviewText;
    @SerializedName("ReplyText")
    @Expose
    private Object replyText;
    @SerializedName("Rating")
    @Expose
    private Integer rating;
    @SerializedName("HelpfulYesTotal")
    @Expose
    private Integer helpfulYesTotal;
    @SerializedName("HelpfulNoTotal")
    @Expose
    private Integer helpfulNoTotal;
    @SerializedName("CreatedOnUtc")
    @Expose
    private String createdOnUtc;
    @SerializedName("CreationDate")
    @Expose
    private String creationDate;
    @SerializedName("Customer")
    @Expose
    private Customer_ customer;
    @SerializedName("Product")
    @Expose
    private Object product;
    @SerializedName("Store")
    @Expose
    private Store store;
    @SerializedName("ProductReviewHelpfulnessEntries")
    @Expose
    private List<Object> productReviewHelpfulnessEntries = null;

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

    public Object getWhatsGood() {
        return whatsGood;
    }

    public void setWhatsGood(Object whatsGood) {
        this.whatsGood = whatsGood;
    }

    public Object getWhatsBad() {
        return whatsBad;
    }

    public void setWhatsBad(Object whatsBad) {
        this.whatsBad = whatsBad;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Boolean getIsApproved() {
        return isApproved;
    }

    public void setIsApproved(Boolean isApproved) {
        this.isApproved = isApproved;
    }

    public Object getTitle() {
        return title;
    }

    public void setTitle(Object title) {
        this.title = title;
    }

    public Object getReviewText() {
        return reviewText;
    }

    public void setReviewText(Object reviewText) {
        this.reviewText = reviewText;
    }

    public Object getReplyText() {
        return replyText;
    }

    public void setReplyText(Object replyText) {
        this.replyText = replyText;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getHelpfulYesTotal() {
        return helpfulYesTotal;
    }

    public void setHelpfulYesTotal(Integer helpfulYesTotal) {
        this.helpfulYesTotal = helpfulYesTotal;
    }

    public Integer getHelpfulNoTotal() {
        return helpfulNoTotal;
    }

    public void setHelpfulNoTotal(Integer helpfulNoTotal) {
        this.helpfulNoTotal = helpfulNoTotal;
    }

    public String getCreatedOnUtc() {
        return createdOnUtc;
    }

    public void setCreatedOnUtc(String createdOnUtc) {
        this.createdOnUtc = createdOnUtc;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Customer_ getCustomer() {
        return customer;
    }

    public void setCustomer(Customer_ customer) {
        this.customer = customer;
    }

    public Object getProduct() {
        return product;
    }

    public void setProduct(Object product) {
        this.product = product;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public List<Object> getProductReviewHelpfulnessEntries() {
        return productReviewHelpfulnessEntries;
    }

    public void setProductReviewHelpfulnessEntries(List<Object> productReviewHelpfulnessEntries) {
        this.productReviewHelpfulnessEntries = productReviewHelpfulnessEntries;
    }

}
