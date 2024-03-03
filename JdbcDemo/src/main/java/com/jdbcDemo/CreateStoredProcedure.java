package com.jdbcDemo;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateStoredProcedure 
{
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","#Prithvi455#");
		Statement st=con.createStatement();
		st.execute("create procedure `retrivedata`()"
		+"Begin "
		+"select * from student;"
		+"End");
		System.out.println("stored procedure created successfully");
	}
}
