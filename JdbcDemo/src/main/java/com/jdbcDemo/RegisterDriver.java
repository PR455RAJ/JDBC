package com.jdbcDemo;
public class RegisterDriver 
{
	public static void main(String args[]) throws ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver registered successfully");
	}
}
