package com.app.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.demo.pojo.Products;

@Repository
public class ProductsRepoImpl implements ProductsRepo
{
	@Autowired
	EntityManager eMan;
	

	@Override
	public List<Products> getProducts() {
		List<Products> ls=eMan.createQuery("from Products").getResultList();
		return ls;
	}


	@Override
	public boolean addProduct(Products product) {
		eMan.persist(product);
		return true;
	}



	


}
