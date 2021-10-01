package com.app.demo.jparepos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.demo.pojo.Bankdetails;

public interface JPABankdetailsRepo extends JpaRepository<Bankdetails,String> {
	
	@Query("select a.ifsc from Bankdetails a")
	public List<String> getallifsc();
}
