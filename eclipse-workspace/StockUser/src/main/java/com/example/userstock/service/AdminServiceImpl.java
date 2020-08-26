package com.example.userstock.service;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.userstock.entities.User;
import com.example.userstock.repos.AdminRepos;



@Service("adminService")
@Transactional(propagation=Propagation.SUPPORTS)
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminRepos adminRepos;

	@Override
	public User findUser(String user_name, String password) {
		// TODO Auto-generated method stub
		return adminRepos.findUser(user_name, password);
	}

}
