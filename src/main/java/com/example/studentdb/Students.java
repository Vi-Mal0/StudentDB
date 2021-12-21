package com.example.studentdb;

import java.util.*;
import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import javax.persistence.*;

@Entity
public class Students
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String firstname;
	
	private String lastname;

	@ManyToOne
	@JoinColumn(name="department_id", nullable = false)
	private Department department;
	
	
	
	// No Args Constructor
	public Students() {}
	
	//Args COnstructor
	public Students(
			Long id,
			String firstname,
		 String lastname, Department department) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.department=department;
		
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
