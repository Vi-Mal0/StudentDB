package com.example.studentdb;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController 
{
	
	@Autowired
	
	private DepartmentService deptservice;
	
	@GetMapping("/departments")
	public List<Department> findall()
	{
		return deptservice.findall();
	}
	
	@GetMapping("/departments/{id}")
	public Optional<Department> findbyid(@PathVariable("id") Integer id)
	{
		return deptservice.findbyid(id);
	}

	@RequestMapping(path = "/addDepartment", method=RequestMethod.POST)
	public String addDept(@RequestBody Department dept)
	{
		return deptservice.addDept(dept);
	}
	
//	@GetMapping(path = "departments/{id}/students")
//	public List<Students> getStudentByDepartment(@PathVariable("id") Integer id)
//	{
//		return deptservice.getStudentBytDepartment(id);
//	}
	
}
