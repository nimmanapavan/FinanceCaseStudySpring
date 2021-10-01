package com.app.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.demo.jparepos.JPAUsersRepo;
import com.app.demo.jparepos.MyJPARepo;
import com.app.demo.pojo.Users;

@Service
@Transactional
public class UserServiceImpl implements UserService
{
	@Autowired
	JPAUsersRepo jpaRepo;

	@Override
	public List<Users> getUsers() {
		return jpaRepo.findAll();
		
	}

	@Override
	public Users getUserbyID(String id) {
		
		return jpaRepo.findById(id).get();
	}

	@Override
	public boolean updateUser(Users user) {
		jpaRepo.save(user);
		return true;
	}

	@Override
	public List<Users> getUsersforApproval() {
		
		return jpaRepo.getnonapprovedusers();
	}

	@Override
	public boolean addUser(Users user) {
		jpaRepo.save(user);
		return true;
	}

	@Override
	public List<String> getallUserid() {
		return jpaRepo.getalluserid();
	}


}
