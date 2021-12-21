package com.example.studentdb;

import java.util.*;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController 
{
	@Autowired
	
	private StudentService studservice;
	
	@GetMapping("/students")
	public List<Students> findall()
	{
		return studservice.getAllStudents();
	}
	
	@RequestMapping(path = "/addstudents", method = RequestMethod.POST)
	public String addStudents(@Valid @RequestBody Students studs)
	{
		return studservice.addStudents(studs);
	}
	
//	@PatchMapping(path = "/update/{id}")
	
	
	@GetMapping("/students/{id}")
	public Optional<Students> findbyid(@PathVariable("id") Long id)
	{
		return studservice.findbyid(id);
	}
	
	@GetMapping("/departments/{id}/students")
	public List<Students> getStudByDeptID(@PathVariable("id") Integer id)
	{
		return studservice.getStudByDeptID(id);
	}
}
