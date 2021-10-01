package com.app.demo.service;

import java.util.List;

import com.app.demo.pojo.Users;

public interface UserService 
{
	public List<Users> getUsers();
	public Users getUserbyID(String id);
	public boolean updateUser(Users user);
	public boolean addUser(Users user);
	public List<Users> getUsersforApproval();
	public List<String> getallUserid();
}
