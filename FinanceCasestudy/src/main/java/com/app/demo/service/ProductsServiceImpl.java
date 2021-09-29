package com.app.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.demo.jparepos.MyJPARepo;
import com.app.demo.pojo.Products;
import com.app.demo.repository.ProductsRepo;

@Service
@Transactional
public class ProductsServiceImpl implements ProductsService
{
	@Autowired
	ProductsRepo prepo;
	
	@Autowired
	MyJPARepo jpaRepo;

	

	@Override
	public List<Products> getProducts() {
		return prepo.getProducts();
//		return jpaRepo.findAll();
	}



	@Override
	public boolean addProduct(Products product) {
		return prepo.addProduct(product);
	}

	

}
