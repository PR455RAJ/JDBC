package com.abcd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class BatchProcessingWithPreparedStatement 
{
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","#Prithvi455#");
		PreparedStatement ps=con.prepareStatement("insert into branchs(id,branchName,intake,fees)values(?,?,?,?)");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter id");
			int id=sc.nextInt();
			System.out.println("Enter branchName");
			String branchName=sc.next();
			System.out.println("Enter intake");
			int intake=sc.nextInt();
			System.out.println("enter fees ");
			double fees=sc.nextDouble();
			ps.setInt(1,id);
			ps.setString(2, branchName);
			ps.setInt(3, intake);
			ps.setDouble(4, fees);
			ps.addBatch();
		}
		ps.executeBatch();
	}	
}
