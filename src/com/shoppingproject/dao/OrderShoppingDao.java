/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shoppingproject.dao;

import com.shoppingproject.pojo.OrderShopping;

/**
 *
 * @author SAgaRRRR
 */
public interface OrderShoppingDao {
    public boolean insertOrder(OrderShopping order);
    public boolean updateOrder(OrderShopping order);
    public boolean deleteOrder(int orderId);
    public OrderShopping viewOrder(int orderId);
    
    
}
