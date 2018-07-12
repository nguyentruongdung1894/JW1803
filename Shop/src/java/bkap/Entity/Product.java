/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.Entity;

import java.sql.Date;

/**
 *
 * @author ScorPius 31
 */
public class Product {
    private int productId;
    private String categoryId;
    private String productName;
    private String productImage;
    private String imageId;
    private int quantity;
    private String description;
    private float price;
    private String saleId;
    private int view;
    private String supplier;
    private Date date;
    private int sex;
    private boolean status;

    public Product() {
    }

    public Product(int productId, String categoryId, String productName, String productImage, String imageId, int quantity, String description, float price, String saleId, int view, String supplier, Date date, int sex, boolean status) {
        this.productId = productId;
        this.categoryId = categoryId;
        this.productName = productName;
        this.productImage = productImage;
        this.imageId = imageId;
        this.quantity = quantity;
        this.description = description;
        this.price = price;
        this.saleId = saleId;
        this.view = view;
        this.supplier = supplier;
        this.date = date;
        this.sex = sex;
        this.status = status;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSaleId() {
        return saleId;
    }

    public void setSaleId(String saleId) {
        this.saleId = saleId;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
