package com.abcd;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDataDynamicallyIntoTable 
{
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter id");
		int id=scn.nextInt();
		System.out.println("enter branchName");
		String branchName=scn.next();
		System.out.println("enter intake");
		int intake=scn.nextInt();
		System.out.println("enter fees");
		Double fees=scn.nextDouble();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/University","root","#Prithvi455#");
		PreparedStatement ps=con.prepareStatement(("insert into Branchs(id,branchName,intake,fees)values(?,?,?,?)"));
		ps.setInt(1,id);
		ps.setString(2, branchName);
		ps.setInt(3, intake);
		ps.setDouble(4,fees);
		ps.execute();
		System.out.println("data inserted");
	}
}
