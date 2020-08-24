package com.SBA.training.model;

import org.springframework.data.mongodb.core.mapping.Document;

//import javax.persistence.Entity;

@Document(collection = "sbacollect" )
public class SBA{

	
	private String id;
	private String title;
	private String status;
	private String description;

	
	public SBA() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SBA(String id, String title, String status, String description) {
		super();
		this.id = id;
		this.title = title;
		this.status = status;
		this.description = description;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}


	
	
	
	
	
}
