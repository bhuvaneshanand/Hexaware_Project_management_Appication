package com.java.model;

public class Task {
	
	private int task_id; 
	private String task_name;
	private int project_id;
	private int employee_id;
	private String Status;
	
	public Task(){
		
	}
	
	public Task(int task_id,String task_name,int project_id,int employee_id,String Status){	
		this.task_id = task_id;
		this.task_name = task_name;
		this.project_id = project_id;
		this.employee_id = employee_id;
		this.Status=Status;
	}
	

	public int getTask_id() {
		return task_id;
	}
	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}
	public String getTask_name() {
		return task_name;
	}
	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}
	public int getProject_id() {
		return project_id;
	}
	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

}
