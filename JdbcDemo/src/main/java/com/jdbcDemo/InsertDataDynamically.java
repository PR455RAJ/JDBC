package com.jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertDataDynamically 
{
	public static void main(String args[]) throws SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id=sc.nextInt();
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter age");
		int age=sc.nextInt();
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","#Prithvi455#");
		PreparedStatement ps=con.prepareStatement("insert into student(id,name,age)values(?,?,?)");
		ps.setInt(1,id);
		ps.setString(2,name);
		ps.setInt(3,age);
		ps.execute();
		System.out.println("data Inserted");
	}
}
