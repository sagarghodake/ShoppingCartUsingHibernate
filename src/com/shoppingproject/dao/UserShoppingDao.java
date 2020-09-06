/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shoppingproject.dao;

import com.shoppingproject.pojo.UserShopping;

/**
 *
 * @author SAgaRRRR
 */
public interface UserShoppingDao {
    
    public boolean registerUser(UserShopping user);
    public boolean updateUser(UserShopping user);
    public boolean deleteUser(int userId);
    public UserShopping viewUser(int userId);
    public boolean changePassword(String username,String password);
}
