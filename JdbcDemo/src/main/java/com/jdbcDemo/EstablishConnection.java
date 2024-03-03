package com.jdbcDemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class EstablishConnection 
{
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","#Prithvi455#");
		System.out.println("connection established successfully2");
	}
}
