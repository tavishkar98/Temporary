package com.example.userstock.entities;

import java.util.Arrays;
import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String user_name;
	private String password;
	private String user_type;
	private String email;
	private String mobile_no;
	private String confirmation_status;
	
	public User()
	{}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getConfirmation_status() {
		return confirmation_status;
	}

	public void setConfirmation_status(String confirmation_status) {
		this.confirmation_status = confirmation_status;
	}

	@Override
	public String toString() {
		return String.format(
				"User [id=%s, user_name=%s, password=%s, user_type=%s, email=%s, mobile_no=%s, confirmation_status=%s]",
				id, user_name, password, user_type, email, mobile_no, confirmation_status);
	}

	public User(int id, String user_name, String password, String user_type, String email, String mobile_no,
			String confirmation_status) {
		super();
		this.id = id;
		this.user_name = user_name;
		this.password = password;
		this.user_type = user_type;
		this.email = email;
		this.mobile_no = mobile_no;
		this.confirmation_status = confirmation_status;
	}
	
	
	
	
	
}
