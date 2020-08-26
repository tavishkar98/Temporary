package com.example.userstock.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.userstock.entities.User;




@Repository("adminRepos")
public interface AdminRepos extends JpaRepository<User,Integer> {
    
	@Transactional(readOnly=true)
	@Query(value = "SELECT * FROM user WHERE user_name= :user_name AND password=:password",nativeQuery = true)
	 User findUser(@Param("user_name")String user_name, @Param("password") String password);
}