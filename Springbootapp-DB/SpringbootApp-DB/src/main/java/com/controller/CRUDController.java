package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CRUDController {

	@Autowired
	StudentDAO dao;
	
	@PostMapping("insert")
	public Student insert(@RequestBody Student s) {
		return dao.insert(s);
	}
	
	@PostMapping("insertall")
	public List<Student> insertall(@RequestBody List<Student> s) {
		return dao.insertAll(s);
	}
	
	@GetMapping("getall")
	public List<Student> getall() {
		return dao.getall();
	}
	
	@GetMapping("getbyid/{id}")
	public Student getByid(@PathVariable("id") int id) {
		return dao.getByid(id);
	}
	
	@DeleteMapping("deletebyid/{id}")
	public String deleteByid(@PathVariable ("id") int id) {
		return dao.deleteByid(id);
	}
	
	@PutMapping("update")
	public Student update(Student s) {
		return dao.update(s);
	}
	
	@GetMapping("getbyname/{name}")
	public Student getByName(@PathVariable String name) {
		return dao.findByName(name);
	}
	
	
//	@RequestMapping("insert")
//	public ModelAndView insert(@RequestParam("name") String name, @RequestParam("email") String email, HttpServletRequest req, HttpServletResponse res) {
//	
//		ModelAndView mv= new ModelAndView();
//		Student ss=new Student();
//		ss.setName(name);
//		ss.setEmail(email);
//		Student sp = dao.insert(ss);
//		if(sp!=null) {
//			mv.setViewName("status");
//		}
//		return mv;
//	}
//	
//	@RequestMapping("getall")
//	public ModelAndView get( HttpServletRequest req, HttpServletResponse res) {
//	
//		ModelAndView mv= new ModelAndView();
//		List<Student> s = dao.getall();
//		mv.setViewName("display");
//		mv.addObject("list", s);
//		return mv;
//	}
}
