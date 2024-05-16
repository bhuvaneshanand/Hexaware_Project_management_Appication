package com.java.dao;

import java.sql.*;
import java.util.List;

import com.java.model.*;
import com.java.util.*;
import com.java.exception.*;
public class ProjectRepositoryImpl implements IProjectRepository {
	
	
	private Connection conn;
	PreparedStatement stmt;
	
	public ProjectRepositoryImpl(){
		conn=DBPropertyUtil.getConnect();
	}

	public boolean createEmployee(Employee emp) {
		try {
			stmt=conn.prepareStatement("insert into Employee values(?,?,?,?,?,?) ");
			stmt.setInt(1,emp.getId());
			stmt.setString(2, emp.getName());
			stmt.setString(3, emp.getDesignation());
			stmt.setString(4, emp.getGender());
			stmt.setDouble(5, emp.getSalary());
			stmt.setInt(6, emp.getProject_id());
			stmt.executeUpdate();
			System.out.println("Records added");
		}
		catch(SQLException e){
			System.out.println(e);
		}
		
		return true;
	}

	public boolean createProject(Project pj) {
		try {
			stmt=conn.prepareStatement("insert into Project values(?,?,?,?,?) ");
			stmt.setInt(1,pj.getId());
			stmt.setString(2, pj.getProjectName());
			stmt.setString(3, pj.getDescription());
			stmt.setString(4, pj.getStart_date());
			stmt.setString(5, pj.getStatus());
			stmt.executeUpdate();
			System.out.println("Records added");
		
		}
		catch(SQLException e){
			System.out.println(e);
		}
		return true;
	}

	public boolean createTask(Task task) {
		try {
			stmt=conn.prepareStatement("insert into Task values(?,?,?,?,?) ");
			stmt.setInt(1, task.getTask_id());
			stmt.setString(2, task.getTask_name());
			stmt.setInt(3, task.getProject_id());
			stmt.setInt(4, task.getEmployee_id());
			stmt.setString(5,task.getStatus());
			stmt.executeUpdate();
			System.out.println("Records added");
		
		}
		catch(Exception e){
			System.out.println(e);
		}
		return true;
	}

	public boolean assignProjectToEmployee(int projectId, int employeeId)throws EmployeeNotFoundException, ProjectNotFoundException {

	        try{
	        	stmt=conn.prepareStatement("update Employee set project_id = ? where id = ?");
	            stmt.setInt(1,projectId);
	            stmt.setInt(2,employeeId);
	            stmt.executeUpdate();
	            System.out.println("Projects assigned");
	        }
	        catch (SQLException e) {
				System.out.println(e);

	        }
		return true;
	}

	public boolean AssigntaskInProjecttoEmployee(int taskid, int projectid, int employeeId) {
		try{
        	stmt=conn.prepareStatement("update Task set employee_id = ? where task_id = ? and project_id = ?");
            stmt.setInt(1,employeeId);
            stmt.setInt(2,taskid);
            stmt.setInt(3,projectid);
            stmt.executeUpdate();
            System.out.println(" Assigned task in projects to Employees");
        }
        catch (SQLException e) {
			System.out.println(e);

        }
		
		return true;
	}

	public boolean deleteEmployee(int userId) throws EmployeeNotFoundException{
		try{
        	stmt=conn.prepareStatement("delete from Employee where employee_id=?");
            stmt.setInt(1,userId);
            stmt.executeUpdate();
            
            System.out.println("Record deleted from Employee");
            
        }
        catch (SQLException e) {
			System.out.println(e);

        }
		
		return true;
	}
	public boolean deleteProject(int projectId)throws ProjectNotFoundException {
		
		try{
        	stmt=conn.prepareStatement("delete from Project where Id=?");
            stmt.setInt(1,projectId);
            stmt.executeUpdate();
            System.out.println("Record deleted from Project");
            
        }
        catch (SQLException e) {
			System.out.println(e);

        }
		return true;
	}

	public List<Task> getAllTasks(int empId, int projectId) {
		try{
			
        	stmt=conn.prepareStatement("select * from Task where employee_id = ? and project_id = ?");
            stmt.setInt(1,empId);
            stmt.setInt(2,projectId); 
            ResultSet rs = stmt.executeQuery();
	        while(rs.next()) {
	        	System.out.println("Task ID : "+rs.getInt(1));
	        	System.out.println("Task Name : "+rs.getString(2));
	        	System.out.println("Project ID : "+rs.getInt(3));
	        	System.out.println("Employee ID : "+rs.getInt(4));
	        	System.out.println("Task Status : "+rs.getString(5));
	        	
	        }
        }
        catch (SQLException e) {
			System.out.println(e);

        }
		return null;
		
		
	}

}
