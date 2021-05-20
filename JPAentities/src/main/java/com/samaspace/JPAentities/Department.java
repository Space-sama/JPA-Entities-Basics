package com.samaspace.JPAentities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "Department")
public class Department {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	
	@Column(name = "nameDept", nullable = false)
	private String nameDept;
	
	@OneToMany (mappedBy = "dept")
	
	private List<Employee> emps;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameDept() {
		return nameDept;
	}

	public void setNameDept(String nameDept) {
		this.nameDept = nameDept;
	}
	

}
