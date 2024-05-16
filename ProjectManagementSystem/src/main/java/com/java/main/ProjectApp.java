package com.java.main;

import com.java.exception.*;
import com.java.service.projectService;
import java.util.*;

public class ProjectApp {
	

	public static void main(String[] args) throws EmployeeNotFoundException, ProjectNotFoundException {
       
		projectService ps=new projectService();
		Scanner sc=new Scanner(System.in);
		
        while (true) {
            System.out.println("-----Project Management System-----");
            System.out.println("1. Add Employee");
            System.out.println("2. Add Project");
            System.out.println("3. Add Task");
            System.out.println("4. Assign project to employee");
            System.out.println("5. Assign task within a project to employee");
            System.out.println("6. Delete Employee");
            System.out.println("7. Delete Project");
            System.out.println("8. List all projects assigned with tasks to an employee");
            System.out.println("9. Exit");
            
            System.out.println("Enter your choice: ");
            int ch = sc.nextInt();


            switch (ch) {
                case 1:
                    ps.createEmployee();
                    break;
                case 2:
                    ps.createProject();
                    break;
                case 3:
                    ps.createTask();
                    break;
                case 4:
                    ps.assignProjectToEmployee();
                    break;
                case 5:
                    ps.AssigntaskInProjecttoEmployee();
                    break;
                case 6:
                    ps.deleteEmployee();
                    break;
                case 7:
                    ps.deleteProject();
                    break;
                case 8:
                    ps.getAllTasks();
                    break;
                case 9:
                    System.out.println("Exiting Project Management System");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

	}

}
