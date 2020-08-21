package com.example2.training.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
public class Customer {

	@Id
	@Column(name = "customer_id")
	private String customerId;
	@Column(name = "customer_name")
	private String name;
	@Column(name = "account_balance")
	private double accountBalance;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerId, String name, double accountBalance) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.accountBalance = accountBalance;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	
}
