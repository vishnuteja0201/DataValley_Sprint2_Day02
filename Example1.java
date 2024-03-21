package com.javaJdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Example1 
{

	//database credentials
	private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/product_db";
	private static final String DATABASE_USERNAME= "root";
	private static final String DATABASE_PASSWORD= "20BQ1a4726@";
	
	 public static Connection getDBConnection()
	 {
		
		 Connection connection = null;
		 
		 try
		 {
			//step1:load/register with driver 
			Class.forName(DRIVER_NAME);	
			//step2: create connection object 
			Connection  connection = DriverManager.getConnection(DATABASE_URL,DATABASE_USERNAME,DATABASE_PASSWORD);
			if(connection!= null)
			{
				System.out.println("database connection is successfull");
			}
			else
			{
				System.out.println("database connection is failed");
			}
		 }
		 catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();
		 }
		 return connection;
	}
	
	
	
}
