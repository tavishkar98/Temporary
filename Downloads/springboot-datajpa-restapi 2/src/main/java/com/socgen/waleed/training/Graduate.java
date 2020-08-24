package com.socgen.waleed.training;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Graduate {

	@Id //Tell JPA this is my primary key
	@GeneratedValue(strategy = GenerationType.AUTO) //Tell JPA to have this field as auto-increment
	Integer id;
	
	String department, place;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	
	
}
