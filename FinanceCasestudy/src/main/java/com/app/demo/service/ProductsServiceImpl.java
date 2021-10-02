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
//		return prepo.getProducts();
		return jpaRepo.findAll();
	}



	@Override
	public boolean addProduct(Products product) {
		return prepo.addProduct(product);
	}



	@Override
	public boolean updateProduct(Products product) {
		return prepo.updateProduct(product);
	}



	@Override
	public Products searchProductbyID(String pid) {
		return jpaRepo.findById(pid).get();
	}



	@Override
	public boolean deleteProductbyID(String pid) {
		jpaRepo.deleteById(pid);
		return true;
	}



	@Override
	public Products getsingleProduct() {
		return jpaRepo.getsingleProduct();
	}

	

}
