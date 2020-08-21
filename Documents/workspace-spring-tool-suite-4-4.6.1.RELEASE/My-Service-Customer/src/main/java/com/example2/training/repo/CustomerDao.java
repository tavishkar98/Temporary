package com.example2.training.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example2.training.model.Customer;


@Repository
public interface CustomerDao extends JpaRepository<Customer,String>{

}
