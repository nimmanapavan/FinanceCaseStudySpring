package com.app.demo.jparepos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.demo.pojo.Products;
import com.app.demo.pojo.Users;

public interface MyJPARepo extends JpaRepository<Products, String>
{
	@Query("select p from Products p where rownum=1")
	public Products getsingleProduct();
}
