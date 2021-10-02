package com.app.demo.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.app.demo.pojo.Orders;
import com.app.demo.pojo.Prodimage;
import com.app.demo.pojo.Products;
import com.app.demo.pojo.Users;
import com.app.demo.service.AddressService;
import com.app.demo.service.BankService;
import com.app.demo.service.OrderService;
import com.app.demo.service.ProductsService;
import com.app.demo.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/fms")
public class MyRestController 
{
	@Autowired
	ProductsService pService;
	
	@Autowired
	UserService uService;
	
	@Autowired
	BankService bService;
	
	@Autowired
	AddressService aService;
	
	@Autowired
	OrderService oService;
	
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
	public Products searchProductbyID(@PathVariable(name="product_id") String vNo)
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
	
	@PostMapping("/users")
	public boolean addUsers(@RequestBody Users user)
	{
		return uService.addUser(user);
	}
	
	@GetMapping("/users/not approved")
	public List<Users> getUsersforApproval()
	{
		return uService.getUsersforApproval();
	}
	
	@PostMapping("/prodimg")
	public boolean upload(@RequestBody Prodimage img) {
		String imageUploadLocation = "C:/Users/nimmana pavan/Desktop/New folder";
		String fileName = img.getProd_img().getOriginalFilename();
		String targetFile = imageUploadLocation + fileName;
		try {
			FileCopyUtils.copy(img.getProd_img().getInputStream(), new FileOutputStream(targetFile));
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	@GetMapping("/alluserid")
	public List<String> getalluserid()
	{
		return uService.getallUserid();
	}
	
	@GetMapping("/allpincodes")
	public List<Long> getallpincodes()
	{
		return aService.getallpincodes();
	}
	
	@GetMapping("/allifsc")
	public List<String> getallifsc()
	{
		return bService.getallifsc();
	}
	
	@GetMapping("/orders")
	public List<Orders> getAllOrders()
	{
		return oService.getOrders();
	}
	
	@GetMapping("/orders/{user_id}")
	public List<Orders> getordersbyuserId(@PathVariable(name="user_id") String vNo)
	{
		return oService.getordersbyuserid(vNo);
	}
	
	@GetMapping("/oneproduct")
	public Products getSingleProduct() {
		return pService.getsingleProduct();
	}
	
	@GetMapping("/orders/{userid}/{prodid}")
	public Orders getLastTransaction(@PathVariable(name = "userid") String uid, @PathVariable(name = "prodid") String pid) {
		return oService.getlasttransaction(uid, pid);
	}
	
	@PostMapping("/orders")
	public boolean addOrder(@RequestBody Orders order) {
		return oService.addOrder(order); 
	}
	
}
