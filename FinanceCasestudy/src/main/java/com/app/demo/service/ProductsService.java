package com.app.demo.service;

import java.util.List;

import com.app.demo.pojo.Products;

public interface ProductsService 
{
	public List<Products> getProducts();
	public boolean addProduct(Products product);
}
