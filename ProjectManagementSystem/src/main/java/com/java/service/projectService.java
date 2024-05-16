package com.java.service;

import java.util.Scanner;

import com.java.dao.*;
import com.java.exception.EmployeeNotFoundException;
import com.java.exception.ProjectNotFoundException;
import com.java.model.Employee;
import com.java.model.Project;
import com.java.model.Task;

public class projectService{
	
	Scanner sc ;
	ProjectRepositoryImpl pri;
	
	public projectService() {
		sc= new Scanner(System.in);
		pri=new ProjectRepositoryImpl();
	}
	
	
	public void createEmployee() {
		
		Employee e=new Employee();
		
		System.out.println("Enter ID : ");
		e.setId(sc.nextInt());
		
		System.out.println("Enter name : ");
		sc.nextLine();
		e.setName(sc.nextLine());
		
		System.out.println("Designation : ");
		e.setDesignation(sc.nextLine());
		
		System.out.println("Enter Gender : ");
		e.setGender(sc.nextLine());
		
		System.out.println("Enter Salary : ");
		e.setSalary(sc.nextDouble());
		
		System.out.println("Enter Project_id : ");
		e.setProject_id(sc.nextInt());
		pri.createEmployee(e);
	
	}
	
	public void createProject() {
		
		Project p=new Project();
		
		System.out.println("Enter project Id : ");
		p.setId(sc.nextInt());
		
		System.out.println("Enter Project Name : ");
		p.setProjectName(sc.nextLine());
		
		System.out.println("Enter Discription : ");
		p.setDescription(sc.nextLine());
	
		System.out.println("Enter Starting date : ");
		p.setStart_date(sc.nextLine());
		
		System.out.println("Enter Status(started/dev/build/test/deployed) : ");
		p.setStatus(sc.nextLine());
		
		pri.createProject(p);
		
	}
	
	public void createTask() {
		Task t = new Task();
		
		
		System.out.println("Enter Task Id : ");
		t.setTask_id(sc.nextInt());
		
		System.out.println("Enter Task name : ");
		t.setTask_name(sc.nextLine());
		
		System.out.println("Enter Project Id : ");
		t.setProject_id(sc.nextInt());
		
		System.out.println("Enter Employee Id : ");
		t.setEmployee_id(sc.nextInt());
		
		System.out.println(" Enter Status (Assigned, started, completed)");
	    t.setStatus(sc.nextLine());
	    
	    pri.createTask(t);
		
	}
	
	
	public void assignProjectToEmployee() throws EmployeeNotFoundException, ProjectNotFoundException {
        System.out.println("Enter Project ID:");
        int projectId = sc.nextInt();

        System.out.println("Enter Employee ID:");
        int employeeId = sc.nextInt();
        pri.assignProjectToEmployee(projectId, employeeId);
	}
	
	
	public void AssigntaskInProjecttoEmployee() {
		 	System.out.println("Enter Task ID : ");
		 	int taskid=sc.nextInt();
		 	
		    System.out.println("Enter Project ID : ");
	        int projectId = sc.nextInt();

	        System.out.println("Enter Employee ID : ");
	        int employeeId = sc.nextInt();
	        pri.AssigntaskInProjecttoEmployee(taskid, projectId, employeeId);
	}
	
	
	public void deleteEmployee() throws EmployeeNotFoundException{
		 int userId;
		 System.out.println("Enter Employee ID to delete : ");
		 userId=sc.nextInt();		
		 pri.deleteEmployee(userId);
		 
		 
}
	
	public void deleteProject() throws ProjectNotFoundException{
		
		 System.out.println("Enter Project ID to delete : ");
		 int projectId=sc.nextInt();
		 pri.deleteProject(projectId);	
	}
	
	public void getAllTasks() {

		System.out.println("Enter Employee ID to show list  : ");
		int empId=sc.nextInt();
		
		System.out.println("Enter Project ID to show list  : ");
		int projectId=sc.nextInt();
		
		pri.getAllTasks(empId, projectId);
		
		
	}

}

