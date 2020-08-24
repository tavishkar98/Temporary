package com.socgen.waleed.training;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GraduateRepository extends CrudRepository<Graduate, Integer>{

	Optional<Graduate> findByDepartment(String department);
	List<Graduate> findByPlace(String place);
	
	
//	@Query(nativeQuery = true, value = "select * from graduate where ssssssss")
//	List<Graduate> searchForGraduates();
	
}
