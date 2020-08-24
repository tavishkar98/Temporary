package com.socgen.waleed.training;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GraduateService {
	
	@Autowired
	GraduateRepository repo;

	Iterable<Graduate> getAllData() {
		return repo.findAll();
	}
	
	Optional<Graduate> getGraduateById(int id) {
		return repo.findById(id);
	}
	
	void addNewGraduate(Graduate theGraduate) {
		repo.save(theGraduate);
	}
	
	void updateGraduate(Graduate theGraduate, int id) {
		repo.save(theGraduate);
	}
	
	void deleteGraduate(int id) {
		repo.deleteById(id);
	}
	
//	For custom methods:
	Optional<Graduate> getGraduateByDepartment(String department){
		return repo.findByDepartment(department);
	}
	
	List<Graduate> getGraduateByPlace(String place){
		return repo.findByPlace(place);
	}
	
	
	
	
}
