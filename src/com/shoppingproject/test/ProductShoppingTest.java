/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shoppingproject.test;

import com.shoppingproject.impl.ProductShoppingDaoImpl;
import com.shoppingproject.pojo.ProductShopping;

/**
 *
 * @author SAgaRRRR
 */
public class ProductShoppingTest {
    public static void main(String args[]){
        ProductShopping product=new ProductShopping();
        ProductShoppingDaoImpl productDao=new ProductShoppingDaoImpl();
        
        product.setProductName("Real me 2");
        product.setProductCompany("Oppo ReaalMe");
        product.setProductPrice(10000);
        product.setShippingCharges(50);
        product.setProductAvailibility("Available");
        
        boolean addProduct=productDao.insertProduct(product);
        if(addProduct){
            System.out.println("Product added sucessfully");
        }else{
            System.out.println("Prodect not added.!!! Try Again...!!!");
        }
    }
    
}
