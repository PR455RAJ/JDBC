package com.jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteDataDynamically2 {
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter name to delete");
		String name=sc.next();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","#Prithvi455#");
		PreparedStatement ps=con.prepareStatement("delete from student where name=?");
		ps.setString(1, name);
		ps.execute();
		System.out.println("deleted");
	}

}
