package com.SBA.training.service;

import com.SBA.training.model.SBA;

public interface SBAService {
	
	public Iterable<SBA> getAllSBA();
	public void addNew(SBA note);
	public void updateNew(SBA note, String id);
	public void deleteNote(String id);
	public void deleteAllNotes();

}
