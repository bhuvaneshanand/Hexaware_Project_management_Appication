package com.java.model;

public class Employee {
	
	private int id; 
	private String name;  
	private String Designation; 
	private String Gender; 
	private double Salary; 
	private int Project_id;
	
	public Employee(){
		
	}
	
	public Employee(int id,String name,String Designation,String Gender,double Salary,int Project_id){
		
		this.id=id;
		this.name=name;
		this.Designation=Designation;
		this.Gender=Gender;
		this.Salary=Salary;
		this.Project_id=Project_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		this.Designation = designation;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		this.Gender = gender;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		this.Salary = salary;
	}

	public int getProject_id() {
		return Project_id;
	}

	public void setProject_id(int project_id) {
		this.Project_id = project_id;
	}
	
	

}
