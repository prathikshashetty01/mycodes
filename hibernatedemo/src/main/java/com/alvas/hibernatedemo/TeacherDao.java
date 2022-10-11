package com.alvas.hibernatedemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class TeacherDao {
	Connection con;
	public Teacher saveTeacher(Teacher teacher)
	{
		con= TeacherConnection.getConnection();
		//System.out.println(con);
		String insert="insert into teacher value(?,?,?)";
		try
		{
		PreparedStatement preparedStatement = con.prepareStatement(insert);
		preparedStatement.setInt(1, teacher.id);
		preparedStatement.setString(2,teacher.name);
		preparedStatement.setString(3, teacher.subname);
	
		preparedStatement.execute();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return teacher;
}
	public Teacher updateTeacher(Teacher teacher)
	{
		con=TeacherConnection.getConnection();
		String insert = "update teacher set name =? where id =? ";
		try
		{
			PreparedStatement preparedStatement = con.prepareStatement(insert);
			preparedStatement.setString(1,teacher.name);
			preparedStatement.setInt(2, teacher.id);
			preparedStatement.execute();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return teacher;
	}
	public Teacher deleteTeacher(Teacher teacher)
	{
		con=TeacherConnection.getConnection();
		try {
			String insert="delete from teacher  where id=10";
			Statement st=con.createStatement();
			boolean b=st.execute(insert);

			 System.out.println("data deleted");
			}

			    catch(SQLException e)
			{
			    e.printStackTrace();
			    }
		return teacher;
		}
	

}
