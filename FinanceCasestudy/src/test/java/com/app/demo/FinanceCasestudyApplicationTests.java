package com.app.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.demo.pojo.Products;
import com.app.demo.pojo.Users;
import com.app.demo.service.AddressService;
import com.app.demo.service.BankService;
import com.app.demo.service.ProductsService;
import com.app.demo.service.UserService;

@SpringBootTest
class FinanceCasestudyApplicationTests 
{
	@Autowired
	UserService uService;
	
	@Autowired
	AddressService aService;
	
	@Autowired
	BankService bService;
	
	@Autowired
	ProductsService pService;

	@Test
	public void testgetallpincodes()
	{
		ArrayList<Long> pincodes=new ArrayList<Long>();
		pincodes.add((long) 403002);
		pincodes.add((long) 403003);
		pincodes.add((long) 403004);
		pincodes.add((long) 403005);
		pincodes.add((long) 403006);
		pincodes.add((long) 403007);
		pincodes.add((long) 403008);
		pincodes.add((long) 403009);
		pincodes.add((long) 403010);
		
		
		assertEquals(pincodes,aService.getallpincodes());
	}
	
	@Test
	public void testgetallifsc()
	{
		ArrayList<String> ifscs=new ArrayList<String>();
		ifscs.add("HDFC001");
		ifscs.add("HDFC002");
		ifscs.add("HDFC003");
		ifscs.add("HDFC004");
		ifscs.add("HDFC005");

		ifscs.add("HSBC001");
		ifscs.add("HSBC002");
		ifscs.add("HSBC003");
		ifscs.add("HSBC004");
		ifscs.add("HSBC005");
		ifscs.add("ICICI001");
		ifscs.add("ICICI002");
		ifscs.add("ICICI003");
		ifscs.add("ICICI004");
		ifscs.add("ICICI005");

		assertEquals(ifscs,bService.getallifsc());
	}
	
//	@Test
//	public void testaddProducts()
//	{
//		Products p=new Products("P010110", "AC", 10,"Cool one");
//		assertEquals(pService.addProduct(p),true);
//		
//	}
	
	
//	@Test
//	public void testdeleteProductbyID() {
//		boolean res=pService. deleteProductbyID("P001");
//		assertEquals(res,true);
//		
//	}
	
	@Test
	public void testsearchProductbyID() {
		Products p = new Products();
		p.setProd_id("P001");
		p.setProd_name("SONY Bravia OLED TV");
		p.setPrice(60000);
		p.setDescription("This SONY Bravia OLED Smart TV is everything you would demand and expect from an all-in-one entertainment unit. It lets you share and access all your games, photos, music, movies, and apps in one place. Bored of flipping through your regular TV channels, Log into Netflix or YouTube with just one button click. Its that simple. Quality wise, this smart TV uses a special Dual Database Processing system to upscale the resolution of images and to improve their quality.");
		Products result = pService.searchProductbyID("P001");
		
		assertEquals(p, result);
	}
	
	
	

}
