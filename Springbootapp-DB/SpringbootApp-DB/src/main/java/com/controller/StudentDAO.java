package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentDAO {

	@Autowired
	StudentRepo srepo;
	
	//insert a single object
	public Student insert(Student s) {
		return srepo.save(s);
	}
	
	//retrieve all the objects
	public List<Student> getall(){
		return srepo.findAll();
	}
	
	//insert a collection of objects
	public List<Student> insertAll(List<Student> s) {
		return srepo.saveAll(s);
	}
	
	//fetch by using an ID
	public Student getByid(int id) {
		return srepo.findById(id).orElse(null);
	}
	
	//delete some thing by id
	public String deleteByid(int id) {
		srepo.deleteById(id);
		return "deleted the id value "+ id;
	}
	
	public Student findByName(String name) {
		return srepo.findByName(name);
	}
	
	//update -> finds the value and saves it
	public Student update(Student s) {
		Student existing = srepo.findById(s.getSid()).orElse(null);
		existing.setName(s.getName());
		return srepo.save(existing);
	}
}
