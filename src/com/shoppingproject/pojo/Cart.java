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
public class Cart {
   
    private int id;
    private int customer_id;
    private int discount_price;
    private int produt_dicount;
    private int product_id;
    private String product_image;
    private String product_name;
    private int product_price;
    private int product_quantity;
    private int product_total_price;
    private int main_order_id;

    public Cart(int id, int customer_id, int discount_price, int produt_dicount, int product_id, String product_image, String product_name, int product_price, int product_quantity, int product_total_price, int main_order_id) {
        this.id = id;
        this.customer_id = customer_id;
        this.discount_price = discount_price;
        this.produt_dicount = produt_dicount;
        this.product_id = product_id;
        this.product_image = product_image;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_quantity = product_quantity;
        this.product_total_price = product_total_price;
        this.main_order_id = main_order_id;
    }
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the customer_id
     */
    public int getCustomer_id() {
        return customer_id;
    }

    /**
     * @param customer_id the customer_id to set
     */
    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    /**
     * @return the discount_price
     */
    public int getDiscount_price() {
        return discount_price;
    }

    /**
     * @param discount_price the discount_price to set
     */
    public void setDiscount_price(int discount_price) {
        this.discount_price = discount_price;
    }

    /**
     * @return the produt_dicount
     */
    public int getProdut_dicount() {
        return produt_dicount;
    }

    /**
     * @param produt_dicount the produt_dicount to set
     */
    public void setProdut_dicount(int produt_dicount) {
        this.produt_dicount = produt_dicount;
    }

    /**
     * @return the product_id
     */
    public int getProduct_id() {
        return product_id;
    }

    /**
     * @param product_id the product_id to set
     */
    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    /**
     * @return the product_image
     */
    public String getProduct_image() {
        return product_image;
    }

    /**
     * @param product_image the product_image to set
     */
    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }

    /**
     * @return the product_name
     */
    public String getProduct_name() {
        return product_name;
    }

    /**
     * @param product_name the product_name to set
     */
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    /**
     * @return the product_price
     */
    public int getProduct_price() {
        return product_price;
    }

    /**
     * @param product_price the product_price to set
     */
    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }

    /**
     * @return the product_quantity
     */
    public int getProduct_quantity() {
        return product_quantity;
    }

    /**
     * @param product_quantity the product_quantity to set
     */
    public void setProduct_quantity(int product_quantity) {
        this.product_quantity = product_quantity;
    }

    /**
     * @return the product_total_price
     */
    public int getProduct_total_price() {
        return product_total_price;
    }

    /**
     * @param product_total_price the product_total_price to set
     */
    public void setProduct_total_price(int product_total_price) {
        this.product_total_price = product_total_price;
    }

    /**
     * @return the main_order_id
     */
    public int getMain_order_id() {
        return main_order_id;
    }

    /**
     * @param main_order_id the main_order_id to set
     */
    public void setMain_order_id(int main_order_id) {
        this.main_order_id = main_order_id;
    }

    @Override
    public String toString() {
        return "Cart{" + "id=" + id + ", customer_id=" + customer_id + ", discount_price=" + discount_price + ", produt_dicount=" + produt_dicount + ", product_id=" + product_id + ", product_image=" + product_image + ", product_name=" + product_name + ", product_price=" + product_price + ", product_quantity=" + product_quantity + ", product_total_price=" + product_total_price + ", main_order_id=" + main_order_id + '}';
    }
    
    
    
}
