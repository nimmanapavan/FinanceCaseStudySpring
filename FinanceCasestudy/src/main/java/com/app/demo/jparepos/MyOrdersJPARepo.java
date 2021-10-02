package com.app.demo.jparepos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.demo.pojo.Orders;

public interface MyOrdersJPARepo extends JpaRepository<Orders, String> 
{
	@Query("Select o from Orders o where o.user_id LIKE :ID")
	public List<Orders> getOrdersbyuserid(String ID);

}