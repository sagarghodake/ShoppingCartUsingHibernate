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
public class Order {
       private int id;
       private int after_discount_price;
       private int basic_price;
       private String customer_address;
       private String customer_email;
       private int customer_id;
       private String customer_name;
       private String customer_delivery_address;
       private int customer_phone;
       private int net_price;
       private int order_code;
       private String order_delivered;
       private String order_delivered_date;
       private String order_dispatched;
       private String order_dispatched_date;
       private String order_packed;
       private String order_packed_date;
       private String order_placed;
       private String order_placed_date;
       private String order_status;
       private int payment_id;
       private String payment_method;
       private String payment_status;
       private int total_delivery_charge;
       private int total_discount;
       private String order_date;

    public Order(int id, int after_discount_price, int basic_price, String customer_address, String customer_email, int customer_id, String customer_name, String customer_delivery_address, int customer_phone, int net_price, int order_code, String order_delivered, String order_delivered_date, String order_dispatched, String order_dispatched_date, String order_packed, String order_packed_date, String order_placed, String order_placed_date, String order_status, int payment_id, String payment_method, String payment_status, int total_delivery_charge, int total_discount, String order_date) {
        this.id = id;
        this.after_discount_price = after_discount_price;
        this.basic_price = basic_price;
        this.customer_address = customer_address;
        this.customer_email = customer_email;
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.customer_delivery_address = customer_delivery_address;
        this.customer_phone = customer_phone;
        this.net_price = net_price;
        this.order_code = order_code;
        this.order_delivered = order_delivered;
        this.order_delivered_date = order_delivered_date;
        this.order_dispatched = order_dispatched;
        this.order_dispatched_date = order_dispatched_date;
        this.order_packed = order_packed;
        this.order_packed_date = order_packed_date;
        this.order_placed = order_placed;
        this.order_placed_date = order_placed_date;
        this.order_status = order_status;
        this.payment_id = payment_id;
        this.payment_method = payment_method;
        this.payment_status = payment_status;
        this.total_delivery_charge = total_delivery_charge;
        this.total_discount = total_discount;
        this.order_date = order_date;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAfter_discount_price() {
        return after_discount_price;
    }

    public void setAfter_discount_price(int after_discount_price) {
        this.after_discount_price = after_discount_price;
    }

    public int getBasic_price() {
        return basic_price;
    }

    public void setBasic_price(int basic_price) {
        this.basic_price = basic_price;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_delivery_address() {
        return customer_delivery_address;
    }

    public void setCustomer_delivery_address(String customer_delivery_address) {
        this.customer_delivery_address = customer_delivery_address;
    }

    public int getCustomer_phone() {
        return customer_phone;
    }

    public void setCustomer_phone(int customer_phone) {
        this.customer_phone = customer_phone;
    }

    public int getNet_price() {
        return net_price;
    }

    public void setNet_price(int net_price) {
        this.net_price = net_price;
    }

    public int getOrder_code() {
        return order_code;
    }

    public void setOrder_code(int order_code) {
        this.order_code = order_code;
    }

    public String getOrder_delivered() {
        return order_delivered;
    }

    public void setOrder_delivered(String order_delivered) {
        this.order_delivered = order_delivered;
    }

    public String getOrder_delivered_date() {
        return order_delivered_date;
    }

    public void setOrder_delivered_date(String order_delivered_date) {
        this.order_delivered_date = order_delivered_date;
    }

    public String getOrder_dispatched() {
        return order_dispatched;
    }

    public void setOrder_dispatched(String order_dispatched) {
        this.order_dispatched = order_dispatched;
    }

    public String getOrder_dispatched_date() {
        return order_dispatched_date;
    }

    public void setOrder_dispatched_date(String order_dispatched_date) {
        this.order_dispatched_date = order_dispatched_date;
    }

    public String getOrder_packed() {
        return order_packed;
    }

    public void setOrder_packed(String order_packed) {
        this.order_packed = order_packed;
    }

    public String getOrder_packed_date() {
        return order_packed_date;
    }

    public void setOrder_packed_date(String order_packed_date) {
        this.order_packed_date = order_packed_date;
    }

    public String getOrder_placed() {
        return order_placed;
    }

    public void setOrder_placed(String order_placed) {
        this.order_placed = order_placed;
    }

    public String getOrder_placed_date() {
        return order_placed_date;
    }

    public void setOrder_placed_date(String order_placed_date) {
        this.order_placed_date = order_placed_date;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public int getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public String getPayment_status() {
        return payment_status;
    }

    public void setPayment_status(String payment_status) {
        this.payment_status = payment_status;
    }

    public int getTotal_delivery_charge() {
        return total_delivery_charge;
    }

    public void setTotal_delivery_charge(int total_delivery_charge) {
        this.total_delivery_charge = total_delivery_charge;
    }

    public int getTotal_discount() {
        return total_discount;
    }

    public void setTotal_discount(int total_discount) {
        this.total_discount = total_discount;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", after_discount_price=" + after_discount_price + ", basic_price=" + basic_price + ", customer_address=" + customer_address + ", customer_email=" + customer_email + ", customer_id=" + customer_id + ", customer_name=" + customer_name + ", customer_delivery_address=" + customer_delivery_address + ", customer_phone=" + customer_phone + ", net_price=" + net_price + ", order_code=" + order_code + ", order_delivered=" + order_delivered + ", order_delivered_date=" + order_delivered_date + ", order_dispatched=" + order_dispatched + ", order_dispatched_date=" + order_dispatched_date + ", order_packed=" + order_packed + ", order_packed_date=" + order_packed_date + ", order_placed=" + order_placed + ", order_placed_date=" + order_placed_date + ", order_status=" + order_status + ", payment_id=" + payment_id + ", payment_method=" + payment_method + ", payment_status=" + payment_status + ", total_delivery_charge=" + total_delivery_charge + ", total_discount=" + total_discount + ", order_date=" + order_date + '}';
    }
      
       
    
}
       
       
       
       
       
