package com.java.model;

public class Project {
	private int Id; 
	private String ProjectName; 
	private String Description;
	private String Start_date;
	private String status;
	
	public Project(){
		
	}
	
	public Project(int Id,String ProjectName,String Description,String Start_date,String status){
		
		this.Id=Id;
		this.ProjectName=ProjectName;
		this.Description=Description;
		this.Start_date=Start_date;
		this.status=status;
		
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public String getProjectName() {
		return ProjectName;
	}

	public void setProjectName(String projectName) {
		this.ProjectName = projectName;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		this.Description = description;
	}

	public String getStart_date() {
		return Start_date;
	}

	public void setStart_date(String start_date) {
		this.Start_date = start_date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
