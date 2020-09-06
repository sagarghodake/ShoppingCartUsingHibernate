/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shoppingproject.dao;

import com.shoppingproject.pojo.ProductShopping;

/**
 *
 * @author SAgaRRRR
 */
public interface ProductShoppingDao {
    public boolean insertProduct(ProductShopping product);
    public boolean updateProduct(ProductShopping product);
    public boolean deleteProduct(int productId);
    public ProductShopping viewProduct(int productId);
    
}
