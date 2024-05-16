package com.java.dao;

import java.util.*;

import com.java.exception.*;
import com.java.model.*;

public interface IProjectRepository {
	
	 boolean createEmployee(Employee emp);
	 boolean createProject(Project pj);
	 boolean createTask(Task task);
	 boolean assignProjectToEmployee(int projectId, int employeeId) throws EmployeeNotFoundException, ProjectNotFoundException;
	 boolean AssigntaskInProjecttoEmployee( int taskid, int projectid, int employeeId);
	 boolean deleteEmployee(int userId) throws EmployeeNotFoundException;
	 boolean deleteProject(int projectId) throws ProjectNotFoundException; 
	 List<Task> getAllTasks(int empId,int projectId);
	
}
	 
