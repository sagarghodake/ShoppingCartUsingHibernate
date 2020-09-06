/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shoppingproject.impl;

import com.shoppingproject.dao.UserShoppingDao;
import com.shoppingproject.pojo.ProductShopping;
import com.shoppingproject.pojo.UserShopping;
import java.sql.*;
import static com.shoppingproject.utility.DatabaseConnection.establishConnection;

/**
 *
 * @author SAgaRRRR
 */
public class UserShoppingDaoImpl implements UserShoppingDao{
    Connection con;
    Statement stmt=null;
    PreparedStatement pst=null;
     ResultSet rs=null;
    UserShopping user=new UserShopping();

    @Override
    public boolean registerUser(UserShopping user) {
        con=establishConnection();
        
        String query="insert into user(name,email,password,contact,address) values (?,?,?,?,?)";
        try{
            pst=con.prepareStatement(query);
           
            pst.setString(1,user.getName());
            pst.setString(2, user.getEmail());
            pst.setString(3, user.getPassword());
            pst.setString(4, user.getContact());
            pst.setString(5, user.getAddress());
            
            int rowsAffected=pst.executeUpdate();
            if(rowsAffected>0){
                return true;
            }   
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
        
    }

    @Override
    public boolean updateUser(UserShopping user) {
        con=establishConnection();
        String query="update user set name=?,email=?,password=?,contact=?,address=? where userId=?";
        try{
            
            pst=con.prepareStatement(query);
            pst.setString(1, user.getName());
            pst.setString(2, user.getEmail());
            pst.setString(3, user.getPassword());
            pst.setString(4, user.getContact());
            pst.setString(5, user.getAddress());
            pst.setInt(6, user.getUserId());
            
            int rowsAffected=pst.executeUpdate();
            if(rowsAffected>0){
                return true;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
       return false;
    }

    @Override
    public boolean deleteUser(int userId) {
        con=establishConnection();
        String query="delete from user where userId=?";
        try{
            pst=con.prepareStatement(query);
            pst.setInt(1, user.getUserId());
             int rowsAffected=pst.executeUpdate();
             if(rowsAffected>0){
                 return true;
             }
        }
        catch(Exception e){
            e.printStackTrace();
        }
      return false;
    }

    @Override
    public UserShopping viewUser(int userId) {
        con=establishConnection();
        String query="select * from username where userId=?";
        try{
            pst=con.prepareStatement(query);
            pst.setInt(1, user.getUserId());
            
            rs=pst.executeQuery();
            while(rs.next()){
                user.setName(rs.getString(2));
                user.setEmail(rs.getString(3));
                user.setPassword(rs.getString(4));
                user.setContact(rs.getString(5));
                user.setAddress(rs.getString(6));
            }
        
        }catch(Exception e){
            e.printStackTrace();
        }
       return user;
    }

    @Override
    public boolean changePassword(String username, String password) {
        con=establishConnection();
        String query="update user set password=? where userID=?";
        try{
            pst=con.prepareStatement(query);
            pst.setString(1, user.getPassword());
            pst.setInt(2, user.getUserId());
            
            int rowsAffected=pst.executeUpdate();
            if(rowsAffected>0){
                return true;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }    
}
