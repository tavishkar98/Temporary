package com.example2.training.service;

import java.util.Optional;

import com.example2.training.model.Customer;


public interface CustomerService {

	public Iterable<Customer> getAllCustomer();
	public Optional<Customer> findCustomerById(String customerId);
}
