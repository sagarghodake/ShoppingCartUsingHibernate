/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shoppingproject.pojo;

/**
 *
 * @author SAgaRRRR
 */
public class ProductShopping {
    private int productId;
    private String productName;
    private String productCompany;
    private int productPrice;
    private int shippingCharges;
    private String productAvailibility;

    public ProductShopping() {
    }

    
    public ProductShopping(int productId, String productName, String productCompany, int productPrice, int shippingCharges, String productAvailibility) {
        this.productId = productId;
        this.productName = productName;
        this.productCompany = productCompany;
        this.productPrice = productPrice;
        this.shippingCharges = shippingCharges;
        this.productAvailibility = productAvailibility;
    }

    public String getProductAvailibility() {
        return productAvailibility;
    }

    public void setProductAvailibility(String productAvailibility) {
        this.productAvailibility = productAvailibility;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCompany() {
        return productCompany;
    }

    public void setProductCompany(String productCompany) {
        this.productCompany = productCompany;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getShippingCharges() {
        return shippingCharges;
    }

    public void setShippingCharges(int shippingCharges) {
        this.shippingCharges = shippingCharges;
    }

    @Override
    public String toString() {
        return "Product{" + "productId=" + productId + ", productName=" + productName + ", productCompany=" + productCompany + ", productPrice=" + productPrice + ", shippingCharges=" + shippingCharges + ", productAvailibility=" + productAvailibility + '}';
    }
    
    
    
    
}
