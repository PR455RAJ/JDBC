package com.abcd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableIntoDatabase 
{
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","#Prithvi455#");
		Statement st=con.createStatement();
		st.execute("create table Branchs(id int,branchName varchar(20),intake int,fees double)");
	}
}
