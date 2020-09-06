/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shoppingproject.impl;

import com.shoppingproject.dao.OrderShoppingDao;
import com.shoppingproject.pojo.Order;
import com.shoppingproject.pojo.OrderShopping;
import java.sql.*;
import static com.shoppingproject.utility.DatabaseConnection.establishConnection;


/**
 *
 * @author SAgaRRRR
 */
public class OrderShoppingDaoImpl implements OrderShoppingDao{
    Connection con;
    Statement stmt=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    OrderShopping orderr=new OrderShopping();

    @Override
    public boolean insertOrder(OrderShopping order) {
        con=establishConnection();
        String query="insert into orderr(userId,productId,quantity,orderDate,paymentMethod) values (?,?,?,?,?)";
        try{
            pst=con.prepareStatement(query);
            pst.setInt(1,orderr.getUserId());
            pst.setInt(2, orderr.getProductId());
            pst.setInt(3, orderr.getQuantity());
            pst.setString(4, orderr.getOrderDate());
            pst.setString(5, orderr.getPaymentMethod());
            
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
    public boolean updateOrder(OrderShopping order){
        
        con=establishConnection();
        String query="update orderr set userId=?,productId=?,quantity=?,orderDate=?,paymentMethod=? where orderId=?";
        try{
            pst=con.prepareStatement(query);
            pst.setInt(1,orderr.getUserId());
            pst.setInt(2, orderr.getProductId());
            pst.setInt(3, orderr.getQuantity());
            pst.setString(4, orderr.getOrderDate());
            pst.setString(5, orderr.getPaymentMethod());
            pst.setInt(6, orderr.getOrderId());
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
    public boolean deleteOrder(int orderId) {
  con=establishConnection();
        String query="delete from orderr where orderId=?";
        try{
            pst=con.prepareStatement(query);
            pst.setInt(6, orderr.getOrderId());
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
     public OrderShopping viewOrder(int orderId) {
         con=establishConnection();
        String query="select * from orderr where orderId=?";
        try{
            pst=con.prepareStatement(query);
            pst.setInt(6, orderr.getOrderId());
            rs=pst.executeQuery();
            while(rs.next()){
                orderr.setUserId(rs.getInt(2));
                orderr.setProductId(rs.getInt(3));
                orderr.setQuantity(rs.getInt(3));
                orderr.setOrderDate(rs.getString(4));
                orderr.setPaymentMethod(rs.getString(5));
            }
               
        }catch(Exception e){
            e.printStackTrace();
        }
        return orderr;
    }
      
}
