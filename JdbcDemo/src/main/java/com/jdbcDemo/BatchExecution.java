package com.jdbcDemo;

import java.sql.Statement;
import java.util.Arrays;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BatchExecution
{
	public static void main(String args[])
	{
		try 
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","#Prithvi455#");
			Statement st=con.createStatement();
			st.addBatch("insert into student values(4,'Nothing',31)");
			st.addBatch("insert into student values(5,'VamsiK',32)");
			st.addBatch("update student set name='Prithvi'where id=1");
			int [] ar=st.executeBatch();
			System.out.println(Arrays.toString(ar));
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
