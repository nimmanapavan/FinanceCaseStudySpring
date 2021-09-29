package com.app.demo.repository;

import java.util.List;

import com.app.demo.pojo.Products;

public interface ProductsRepo 
{
	public List<Products> getProducts();
	public boolean addProduct(Products product);
}
