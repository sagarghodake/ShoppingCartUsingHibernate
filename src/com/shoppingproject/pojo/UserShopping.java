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
public class UserShopping {
    private int userId;
    private String name;
    private String email;
    private String password;
    private String contact;
    private String address;

    public UserShopping() {
    }

    
    public UserShopping(int userId, String name, String email, String password, String contact, String address) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.contact = contact;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "UserShopping{" + "userId=" + userId + ", name=" + name + ", email=" + email + ", password=" + password + ", contact=" + contact + ", address=" + address + '}';
    }
    
    
    
}
