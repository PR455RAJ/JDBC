package com.jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataInsideSchool 
{
	public static void main(String args[]) throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","#Prithvi455#");
		Statement st=con.createStatement();
		st.execute("insert into student(id,name,age)values(1,'Prithvi',10)");
	}
}
