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
public class OrderShopping {
    private int orderId;
    private int userId;
    private int productId;
    private int quantity;
    private String orderDate;
    private String paymentMethod;

    public OrderShopping() {
    }
    
    
    public OrderShopping(int orderId, int userId, int productId, int quantity, String orderDate, String paymentMethod) {
        this.orderId = orderId;
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
        this.orderDate = orderDate;
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "OrderShopping{" + "orderId=" + orderId + ", userId=" + userId + ", productId=" + productId + ", quantity=" + quantity + ", orderDate=" + orderDate + ", paymentMethod=" + paymentMethod + '}';
    }
    
    
}
