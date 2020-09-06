/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shoppingproject.utility;
import java.sql.*;
public class DatabaseConnection {
    private static Connection con=null;
   public static Connection establishConnection(){
        if(con==null){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shoppingproject","root","");
            }
            catch(SQLException e){
                e.printStackTrace();
            }
            catch(ClassNotFoundException e){
                e.printStackTrace();
            }
        }
        return con;
    }
    public static void main(String args[]){
        System.out.println("Connection established sucessfully.."+establishConnection());
    }
   
}