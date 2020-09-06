/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shoppingproject.impl;

import com.shoppingproject.dao.OrderDao;
import com.shoppingproject.pojo.Order;
import java.sql.*;
import static com.shoppingproject.utility.DatabaseConnection.establishConnection;
/**
 *
 * @author SAgaRRRR
 */
public class OrderDaoImpl implements OrderDao{
    Connection con;
    Statement stmt=null;
    PreparedStatement pst=null;
    ResultSet rs=null;

    @Override
    public Order insertOrder(Order order) {
        con=establishConnection();
     
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateOrder(Order Order) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteOrder(int orderId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Order viewOrder(Order Order) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
