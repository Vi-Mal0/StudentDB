package com.example.studentdb;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService 
{
	@Autowired
	
	private StudentRepo studrepo;
	
	public List<Students> getAllStudents()
	{
		return studrepo.findAll();
	}
	
	public String addStudents(Students studs)
	{
		studrepo.save(studs);
		return "Student added successfully";
	}


	public Optional<Students> findbyid(Long id)
	{
		return studrepo.findById(id);
	}
	
	public List<Students> getStudByDeptID(Integer id)
	{
		return studrepo.getStudByDeptId(id);
	}


}
