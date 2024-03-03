package com.jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BatchProcessingWithPreparedStatement 
{
	public static void main(String[]args) throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","#Prithvi455#");
		PreparedStatement ps=con.prepareStatement("insert into student(id,name,age)values(?,?,?)");
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter id");
			int id=sc.nextInt();
			System.out.println("enter name");
			String name=sc.next();
			System.out.println("enter age");
			int age=sc.nextInt();
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, age);
			ps.addBatch();
		}
		ps.executeBatch();
	}
}
