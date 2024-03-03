package com.jdbcDemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class GetDataDynamically 
{
	public static void main(String args[])
	{
		int id=new Scanner(System.in).nextInt();
		String url="jdbc:mysql://localhost:3306/school";
		String userName="root";
		String password="#Prithvi455#";
		String query="select * from student where id=?";
		try
		{
			Connection con=DriverManager.getConnection(url,userName,password);
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet set=ps.executeQuery();
			if(set.next())
			{
				System.out.println("Student id is"+set.getInt(1));
				System.out.println("Student name is"+set.getString(2));
				System.out.println("Student age is"+set.getInt(3));
			}
			else
			{
				System.out.println("there is no data");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
