package com.jdbcDemo;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class CreateStatement
{
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","#Prithvi455#");
		Statement st=con.createStatement();
		System.out.println("statement created successfully1");
		st.execute("create database Institute");
		System.out.println("databse created created successfully");
	}
}
