package com.app.demo.jparepos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.demo.pojo.Address;

public interface JPAAddressRepo extends JpaRepository<Address, Long> {
	
	@Query("select a.pincode from Address a")
	public List<Long> getallpincodes();
	
}
