package com.java.util;

import java.sql.Connection;


public class DBPropertyUtil extends DBConnUtil {
	
	public static Connection getConnect()
	 {
		DBConnUtil d1= new DBConnUtil();
		 return conn;
		
	 }

	
}
