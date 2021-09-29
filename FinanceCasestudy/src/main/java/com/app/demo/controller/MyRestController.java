package com.app.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.demo.pojo.Products;
import com.app.demo.service.ProductsService;

@RestController
@RequestMapping("/fms")
@CrossOrigin(origins="http://localhost:4200")
public class MyRestController 
{
	@Autowired
	ProductsService pService;
	
	@GetMapping("/products")
	public List<Products> getAllProducts()
	{
		return pService.getProducts();
	}
	
	@PostMapping("/products")
	public boolean addProducts(@RequestBody Products product)
	{
		return pService.addProduct(product);
	}
}
