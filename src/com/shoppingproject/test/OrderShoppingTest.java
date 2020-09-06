/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shoppingproject.test;

import com.shoppingproject.impl.OrderShoppingDaoImpl;
import com.shoppingproject.pojo.OrderShopping;

/**
 *
 * @author SAgaRRRR
 */
public class OrderShoppingTest {
      public static void main(String args[]){
        OrderShopping order=new OrderShopping();
        OrderShoppingDaoImpl orderDao=new OrderShoppingDaoImpl();
        
        order.setUserId(1);
        order.setProductId(1);
        order.setQuantity(10);
        order.setOrderDate("03/02/2020");
        order.setPaymentMethod("Cash on delivary");
        
        boolean addOrder=orderDao.insertOrder(order);
        if(addOrder){
            System.out.println("Order added sucessfully");
        }else{
            System.out.println("Order not added.!!! Try Again...!!!");
        }
    }
    
}
