/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shoppingproject.impl;

import com.shoppingproject.dao.ProductShoppingDao;
import com.shoppingproject.pojo.ProductShopping;
import java.sql.*;
import static com.shoppingproject.utility.DatabaseConnection.establishConnection;

/**
 *
 * @author SAgaRRRR
 */
public class ProductShoppingDaoImpl implements ProductShoppingDao{
    Connection con;
    Statement stmt=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    ProductShopping product=new ProductShopping();


    @Override
    public boolean insertProduct(ProductShopping product) {
        con=establishConnection();
        String query="insert into product(productName,productCompany,productPrice,shippingCharges,productAvailability) values (?,?,?,?,?)";
        try{
            pst=con.prepareStatement(query);
            pst.setString(1,product.getProductName());
            pst.setString(2, product.getProductCompany());
            pst.setInt(3, product.getProductPrice());
            pst.setInt(4, product.getShippingCharges());
            pst.setString(5, product.getProductAvailibility());
            
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
    public boolean updateProduct(ProductShopping product) {
        con=establishConnection();
        String query="update product set productName=?,productCompany=?,productPrice=?,shippingCharges=?,productAvailability=?)"
                + "     where productId=?";
        try{
            pst=con.prepareStatement(query);
            pst.setString(1,product.getProductName());
            pst.setString(2, product.getProductCompany());
            pst.setInt(3, product.getProductPrice());
            pst.setInt(4, product.getShippingCharges());
            pst.setString(5, product.getProductAvailibility());
            pst.setInt(6, product.getProductId());
            
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
    public boolean deleteProduct(int productId) {
       con=establishConnection();
        String query="delete form product where productId=?";
        try{
            pst=con.prepareStatement(query);
            pst.setInt(1,product.getProductId());
            
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
    public ProductShopping viewProduct(int productId) {
        
       con=establishConnection();
       String query="select * from product where productId=?";
       try{
           pst=con.prepareStatement(query);
           pst.setInt(1, product.getProductId());
           rs=pst.executeQuery();
           while(rs.next()){
              product.setProductName(rs.getString(2));
              product.setProductCompany(rs.getString(3));
              product.setProductPrice(rs.getInt(4));
              product.setShippingCharges(rs.getInt(5));
              product.setProductAvailibility(rs.getString(6));
           }
       
       }catch(Exception e){
           e.printStackTrace();
       }
       return product;
    }
    
    
     public static void main(String args[]){
         
     }
    
    
}
