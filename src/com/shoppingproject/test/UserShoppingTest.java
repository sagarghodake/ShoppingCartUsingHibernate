/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shoppingproject.test;

import com.shoppingproject.impl.UserShoppingDaoImpl;
import com.shoppingproject.pojo.UserShopping;

/**
 *
 * @author SAgaRRRR
 */
public class UserShoppingTest {
    public static void main(String args[]){
        
         UserShopping user=new UserShopping();
         UserShoppingDaoImpl call=new UserShoppingDaoImpl();
         
         user.setName("Sagar Ghodake");
         user.setEmail("sagarghodake1432@gmail.com");
         user.setPassword("sagar");
         user.setContact("9527495733");
         user.setAddress("Narhe,Pune");
         boolean registerUser=call.registerUser(user);
         if(registerUser){
             System.out.println("User registered sucessfully...!!!");
         }else{
             System.out.println("User registration failed...!!! Try Again...!!!");
         }
    }  
    
}
