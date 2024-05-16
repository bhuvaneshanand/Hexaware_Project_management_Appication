package com.java.util;

import java.sql.*;

public class DBConnUtil {
	
	public static Connection conn = null;
	public  DBConnUtil() {
     try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
 
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_management_system", "root", "root");
 
            System.out.println("Connected to the database");
           
        }
        catch(Exception e)
        {
        	
        	System.out.println(e);
        }
 
	}
	
}

