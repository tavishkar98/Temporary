package com.SBA.training.service;

import org.springframework.stereotype.Service;

import com.SBA.training.model.SBA;
import com.SBA.training.repo.SBArepo;

@Service
public class SBAServiceImpl implements SBAService {
	
	SBArepo repo;

	public SBAServiceImpl(SBArepo repo) {
		super();
		this.repo = repo;
	}
	
	public Iterable<SBA> getAllSBA(){
		return repo.findAll();
	}
	
	public void addNew(SBA note) {
		repo.save(note);
	}
	
	public void updateNew(SBA note, String id) {
		repo.save(note);
	}
	
	public void deleteNote(String id) {
		repo.deleteById(id);
	}
	
	public void deleteAllNotes() {
		repo.deleteAll();
	}
	

}
