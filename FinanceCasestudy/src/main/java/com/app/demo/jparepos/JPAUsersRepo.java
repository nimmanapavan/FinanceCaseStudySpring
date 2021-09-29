package com.app.demo.jparepos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.demo.pojo.Users;

public interface JPAUsersRepo extends JpaRepository<Users,String>
{
	@Query("select v from Users v where v.approval_status LIKE '%no%'")
	public List<Users> getnonapprovedusers();

}
