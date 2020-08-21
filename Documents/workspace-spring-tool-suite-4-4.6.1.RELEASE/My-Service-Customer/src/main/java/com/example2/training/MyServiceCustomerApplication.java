package com.example2.training;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example2.training.model.Customer;
import com.example2.training.repo.CustomerDao;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.test", "com.bean"}) 

public class MyServiceCustomerApplication implements CommandLineRunner  {
	
	private CustomerDao customerDao;

	public static void main(String[] args) {
		SpringApplication.run(MyServiceCustomerApplication.class, args);
	}

	public MyServiceCustomerApplication(CustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	}
	
	public void run(String... args) throws Exception {
		customerDao.save(new Customer(UUID.randomUUID().toString(),"John Doe",200000));
		customerDao.save(new Customer(UUID.randomUUID().toString(),"Marry Public",120000));
		customerDao.save(new Customer(UUID.randomUUID().toString(),"Demo Name",70000));
		
	}
	

}
