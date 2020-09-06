/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shoppingproject.dao;

import com.shoppingproject.pojo.Cart;

/**
 *
 * @author SAgaRRRR
 */
public interface CartDao {
    public Cart insertCart(Cart cart);
    public boolean updateCart(Cart cart);
    public boolean deleteCart(int cartId);
    public Cart viewCart();
}
