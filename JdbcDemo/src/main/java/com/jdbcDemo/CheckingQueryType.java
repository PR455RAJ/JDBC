package com.jdbcDemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CheckingQueryType 
{
	public static void main(String args[])
	{
//		System.out.println("Enter query");
//		int id=new Scanner(System.in).nextInt();
		String url="jdbc:mysql://localhost:3306/school";
		String userName="root";
		String password="#Prithvi455#";
		String query="select * from student where id=1";
		try 
		{
			Connection con=DriverManager.getConnection(url,userName,password);
			Statement ps=con.createStatement();
			boolean b=ps.execute(query);
			if(b)
			{
				System.out.println("query is select query");
			}
			else
			{
				System.out.println("query is non select query");
			}
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	}
}
