package com.jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateDataDynamically 
{
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter id to update");
		int id=scn.nextInt();
		System.out.println("Enter new name to update");
		String name=scn.next();
		System.out.println("enter new age");
		int age=scn.nextInt();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","#Prithvi455#");
		PreparedStatement ps=con.prepareStatement("update student set name=?,age=? where id=?");
		ps.setString(1, name);
		ps.setInt(2,age);
		ps.setInt(3, id);
		ps.executeUpdate();
		System.out.println("Updated");
	}
}
