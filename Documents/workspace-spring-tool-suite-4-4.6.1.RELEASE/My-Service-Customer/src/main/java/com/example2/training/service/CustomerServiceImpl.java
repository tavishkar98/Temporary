package com.example2.training.service;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example2.training.model.Customer;
import com.example2.training.repo.CustomerDao;

@Service
public class CustomerServiceImpl implements CustomerService {

	private CustomerDao customerDao;


	public CustomerServiceImpl(CustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	}
	
	@Transactional
	public Optional<Customer> findCustomerById(String customerId) {
		// TODO Auto-generated method stub
		return customerDao.findById(customerId);
	}
	
	@Transactional
	public Iterable<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return customerDao.findAll();
	}
	
	
}
