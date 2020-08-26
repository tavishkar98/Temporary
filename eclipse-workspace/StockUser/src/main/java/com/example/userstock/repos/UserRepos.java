package com.example.userstock.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.userstock.entities.User;




@Repository("userRepos")
public interface UserRepos extends JpaRepository<User,Integer>{

}