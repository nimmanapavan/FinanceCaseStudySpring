package com.app.demo.service;

import java.util.List;

import com.app.demo.pojo.Products;

public interface ProductsService 
{
	public List<Products> getProducts();
	public boolean addProduct(Products product);
	public boolean updateProduct(Products product);
	public Products searchProductbyID(String pid);
	public boolean deleteProductbyID(String pid);
	
	public Products getsingleProduct();
}
