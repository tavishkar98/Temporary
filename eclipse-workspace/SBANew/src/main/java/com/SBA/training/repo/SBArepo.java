package com.SBA.training.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

import com.SBA.training.model.SBA;
//import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface SBArepo extends MongoRepository<SBA,String> {

	
	
}
