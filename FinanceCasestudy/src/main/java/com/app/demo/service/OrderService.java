package com.app.demo.service;

import java.util.List;

import com.app.demo.pojo.Orders;

public interface OrderService {
	public List<Orders> getOrders();
	
	public List<Orders> getordersbyuserid(String ID);

	public boolean addOrder(Orders o);
	
	public Orders getlasttransaction(String userid , String prodid);

}