package com.springrest.springrest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springrest.springrest.entity.Student;



@Repository
public interface StudentRepository extends CrudRepository<Student,Long>  {

	
	
	
	
	
	
}
