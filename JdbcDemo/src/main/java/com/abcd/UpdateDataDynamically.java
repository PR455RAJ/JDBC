package com.abcd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateDataDynamically 
{
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id to update");
		int id=sc.nextInt();
		System.out.println("Enter new branch name to update");
		String branchName=sc.next();
		System.out.println("Enter intake to update");
		int intake=sc.nextInt();
		System.out.println("Enter fees to update");
		double fees=sc.nextDouble();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","#Prithvi455#");
		PreparedStatement ps=con.prepareStatement("update branchs set branchName=?,intake=?,fees=? where id=?");
		ps.setString(1, branchName);
		ps.setInt(2, intake);
		ps.setDouble(3,fees);
		ps.setInt(4,id);
		ps.execute();
		System.out.println("updated");
	}
}
