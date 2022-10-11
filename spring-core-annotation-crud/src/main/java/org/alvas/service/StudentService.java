package org.alvas.service;

import org.alvas.dao.StudentDao;
import org.alvas.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "myService")
public class StudentService {

		@Autowired
		StudentDao dao;
		
		public Student saveStudent(Student student)
		{
			if(student.getId()>100)
			{
			return dao.saveStudent(student);
			}
			else
			{
				System.out.println("you should provide id>100");
			}
			return null;
		} 
		public Student deletStudent(Student student)
		{
			if(student.getId()!=0)
			{
			return dao.deletStudent(student);
			}
			else
			{
				System.out.println("provide appropriate id");
			}
			return null;
		} 
	}

