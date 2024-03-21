package com.javaJdbcConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Example2 
{

	//database credentials
	private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/product_db";
	private static final String DATABASE_USERNAME= "root";
	private static final String DATABASE_PASSWORD= "20BQ1a4726@";
	
	 public static void main(String[] args)throws SQLException
	 {
		Connection connection = null;
		 try
		 {
			  
			 connection = DatabaseConnection.getDBConnection();
			 
			 Product product = new Product(1100,"Lenovo Laptop T430 model",59029.34);
			 
			 String query = "insert into product(product_id,product_name,product_price)values('"+product.getProductId()+"','"+product.getProductName()+"','"+product.getProductPrice()+"')";
			
			 Statement statement = connection.createStatement();
			 
			 int status = statement.executeUpdate(query);
			 
			 System.out.println(status+" product object stored in database table.");
		 }
		 
		 catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();
		}
		 finally {
			connection.close();
		}
	}
	
	
	
}
