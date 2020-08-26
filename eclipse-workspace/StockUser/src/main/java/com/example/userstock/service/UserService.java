package com.example.userstock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.userstock.entities.User;




public interface UserService  {

	User save(User user);

	Iterable<User> findAll();

	void deleteById(Integer id);
	
	

}