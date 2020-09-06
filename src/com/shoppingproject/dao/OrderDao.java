/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shoppingproject.dao;

import com.shoppingproject.pojo.Order;

/**
 *
 * @author SAgaRRRR
 */
public interface OrderDao {
    public Order insertOrder(Order order);
    public boolean updateOrder(Order Order);
    public boolean deleteOrder(int orderId);
    public Order viewOrder(Order Order);
}
