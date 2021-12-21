package com.example.studentdb;


import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService 
{
	@Autowired
	
	private DepartmentRepo deptrepo;
	
	public List<Department> findall()
	{
		return (List<Department>) deptrepo.findAll();
	}
	
	public Optional<Department> findbyid(int id)
	{
		return deptrepo.findById(id);
	}
	
	public String addDept(Department dept)
	{
		deptrepo.save(dept);
		return "Department added Successfully";
	}

//	public List<Students> getStudentBytDepartment(Integer id) 
//	{
//		return deptrepo.getStudByDept(id);
//	}
	

}
