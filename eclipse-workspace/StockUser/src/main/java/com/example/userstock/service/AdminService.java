package com.example.userstock.service;

import com.example.userstock.entities.User;

public interface AdminService  {
	
	public User findUser(String user_name, String password);

	

}