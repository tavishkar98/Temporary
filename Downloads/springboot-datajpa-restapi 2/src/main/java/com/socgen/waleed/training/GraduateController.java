package com.socgen.waleed.training;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GraduateController {

	@Autowired
	GraduateService service;
	
	
//	For gettinga all details of all graduates
	@RequestMapping("/graduates")
	Iterable<Graduate> getAllData(){
		return service.getAllData();
	}
	
	
//	For searching a graduate by his/her id
	@RequestMapping("/graduates/{id}")
	Optional<Graduate> getGraduateById(@PathVariable int id){
		return service.getGraduateById(id);
	}
	
//	Add a new Graduate
	@RequestMapping(method = RequestMethod.POST, value = "/graduates")
	void addNewGraduate(@RequestBody Graduate theGraduate) {
		service.addNewGraduate(theGraduate);
	}
	
//	Update existing Graduate details by his/her id
	@RequestMapping(method = RequestMethod.PUT, value = "/graduates/{id}")
	void updateGraduate(@RequestBody Graduate theGraduate,@PathVariable Integer id) {
		service.updateGraduate(theGraduate, id);
	}
	
	
//	Delete existing Graduate details by his/her id
	@RequestMapping(method = RequestMethod.DELETE, value = "/graduates/{id}")
	void deleteGraduate(@PathVariable int id) {
		service.deleteGraduate(id);
	}
	
//	For custom search methods:
	@RequestMapping("/graduates/department/{department}")
	Optional<Graduate> getGraduateByDepartment(@PathVariable String department) {
		return service.getGraduateByDepartment(department);
	}
	
	@RequestMapping("/graduates/place/{place}")
	List<Graduate> getGraduateByPlace(@PathVariable String place){
		return service.getGraduateByPlace(place);
	}
	
	
	
	
}
