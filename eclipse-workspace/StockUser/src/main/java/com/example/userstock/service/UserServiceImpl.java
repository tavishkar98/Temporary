package com.example.userstock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.userstock.entities.User;
import com.example.userstock.repos.UserRepos;




@Service("userService")
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserRepos userRepos;

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return userRepos.save(user);
	}

	@Override
	public Iterable<User> findAll() {
		// TODO Auto-generated method stub
		return userRepos.findAll();
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		userRepos.deleteById(id);
		
	}
	
	
}