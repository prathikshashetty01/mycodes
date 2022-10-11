package com.alvas.hibernatedemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TeacherConnection {
	public static Connection getConnection()
	{
		String url ="jdbc:mysql://127.0.0.1:3306/s1";
		String user="root";
		String password="prathiksha123";
		try
		{
			Connection con=DriverManager.getConnection(url,user,password);
			return con;
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return null;
	}


}
