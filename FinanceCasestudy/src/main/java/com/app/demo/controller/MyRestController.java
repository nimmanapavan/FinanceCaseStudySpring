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
import com.app.demo.pojo.Users;
import com.app.demo.service.ProductsService;
import com.app.demo.service.UserService;

@RestController
@RequestMapping("/fms")
public class MyRestController 
{
	@Autowired
	ProductsService pService;
	
	@Autowired
	UserService uService;
	
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
	
	@PutMapping("/products")
	public boolean updateProducts(@RequestBody Products product)
	{
		return pService.updateProduct(product);
	}
	
	@GetMapping("/products/{product_id}")
	public Products getVehiclebyNo(@PathVariable(name="product_id") String vNo)
	{
		return pService.searchProductbyID(vNo);
	}
	
	@DeleteMapping("/products/{product_id}")
	public boolean deleteProductbtID(@PathVariable(name="product_id") String vNo)
	{
		return pService.deleteProductbyID(vNo);
	}
	@GetMapping("/users")
	public List<Users> getAllUsers()
	{
		return uService.getUsers();
	}
	
	@GetMapping("/users/{user_id}")
	public Users getUserbyID(@PathVariable(name="user_id") String vNo)
	{
		return uService.getUserbyID(vNo);
	}
	
	@PutMapping("/users")
	public boolean updateUsers(@RequestBody Users user)
	{
		return uService.updateUser(user);
	}
	
	@GetMapping("/users/not approved")
	public List<Users> getUsersforApproval()
	{
		return uService.getUsersforApproval();
	}
	
	
}
