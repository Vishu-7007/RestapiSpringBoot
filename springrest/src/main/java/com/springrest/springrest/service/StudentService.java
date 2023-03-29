package com.springrest.springrest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.entity.Student;
import com.springrest.springrest.repository.StudentRepository;

@Service
public class StudentService {
	

@Autowired
    private StudentRepository repo;
public Iterable<Student> listAll() {
        return this.repo.findAll();
    }
public void saveOrUpdate(Student students)  
{  
repo.save(students);  
}

public Student getStudentById(long id)  
{  
return repo.findById(id).get();  
}
public void update(Student students, int id)  
{  
repo.save(students);  
}  
 
public void delete(long id)  
{  
repo.deleteById(id);  
}  


	
	
}