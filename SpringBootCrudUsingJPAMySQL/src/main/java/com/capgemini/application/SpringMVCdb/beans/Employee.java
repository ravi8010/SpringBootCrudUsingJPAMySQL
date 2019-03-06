package com.capgemini.application.SpringMVCdb.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;  

@Entity
@Table(name="employee55")
public class Employee {
	 
	@Id
	private int id;
    private double salary;
    private String empName;
    private String designation;
	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
 
  
 
}