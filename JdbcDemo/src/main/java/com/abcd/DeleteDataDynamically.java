package com.abcd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteDataDynamically 
{
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("insert id to delete");
		int id=sc.nextInt();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","#Prithvi455#");
		PreparedStatement ps=con.prepareStatement("delete from branchs where id=?");
		ps.setInt(1, id);
		ps.execute();
	}
}
