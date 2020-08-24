package com.SBA.training.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SBA.training.model.SBA;
import com.SBA.training.repo.SBArepo;
import com.SBA.training.service.SBAService;

@RestController
@RequestMapping("/ng")
public class SBAController {
	
	@Autowired
	private SBAService sbaService;
	
	@Autowired
	private SBArepo repo;
	
	





//	public SBAController(SBAService sbaService) {
//		super();
//		this.sbaService = sbaService;
//	}
	
//	public SBAController(SBAService sbaService, SBArepo sbaRepo) {
//	super();
//	this.sbaService = sbaService;
//	this.repo = repo;
//}
	
	
	@GetMapping("/notes")
	public Iterable<SBA> getAllSBA(){
		return sbaService.getAllSBA();
	}
	


	@PostMapping("/notes/add")
	public ResponseEntity<?> addNewNote(@RequestBody SBA note){
		sbaService.addNew(note);
		return new ResponseEntity("New Note added successfully",HttpStatus.OK);
	}
	
	
	@PutMapping("/notes/update/{id}") 
	public ResponseEntity<SBA> updateNew(@RequestBody SBA note, @PathVariable("id") String id){
		Optional<SBA> noteData = repo.findById(id);
		
		if(noteData.isPresent()) {
			SBA _sba = noteData.get();
		    if(true){
		    	_sba.setStatus(note.getStatus());
		    	return new ResponseEntity<>(repo.save(_sba), HttpStatus.OK);
		    }
		    else {
		    	return new ResponseEntity("Description and title change not allowed", HttpStatus.FORBIDDEN);
		    }
		    
		  } else {
		    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		  }
		}
	
//	@PutMapping("/notes/update/{id}")
//	public ResponseEntity<SBA> updateTutorial(@PathVariable("id") String id, @RequestBody SBA tutorial) {
//	  Optional<SBA> tutorialData = repo.findById(id);
//
//	  if (tutorialData.isPresent()) {
//	    SBA _tutorial = tutorialData.get();
////	    _tutorial.setTitle(tutorial.getTitle());
////	    _tutorial.setDescription(tutorial.getDescription());
////	    _tutorial.setPublished(tutorial.getStatus());
//	    _tutorial.setStatus(tutorial.getStatus());
//	    
//	    return new ResponseEntity<>(repo.save(_tutorial), HttpStatus.OK);
//	  } else {
//	    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//	  }
//	}
	

@DeleteMapping("/notes/delete/{id}")
public ResponseEntity<HttpStatus> deleteNote(@PathVariable("id") String id) {
  try {
    sbaService.deleteNote(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  } catch (Exception e) {
    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
  }
}

@DeleteMapping("/notes/delete")
public ResponseEntity<HttpStatus> deleteAllNotes() {
  try {
	  sbaService.deleteAllNotes();
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  } catch (Exception e) {
    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
  }
}
}
	
	
	
	
	

