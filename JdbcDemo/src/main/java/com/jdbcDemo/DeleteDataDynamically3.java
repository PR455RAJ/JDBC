package com.jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteDataDynamically3 {
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter age to delete");
		int age=sc.nextInt();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","#Prithvi455#");
		PreparedStatement ps=con.prepareStatement("delete from student where age=?");
		ps.setInt(1, age);
		ps.execute();
	}


}
