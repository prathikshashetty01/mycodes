package org.alvas.controller;

import org.alvas.MyConfig;
import org.alvas.dto.Student;
import org.alvas.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
@Component


public class StudentController 
{
	@Autowired
	static
	StudentService service;
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		StudentService service = (StudentService) applicationContext.getBean("myService");
		Student student = (Student)applicationContext.getBean("myStudent");
		student.setId(110);
		System.out.println(student.getId());
		student.setName("prathiksha");
		System.out.println(student.getName());
		student.setEmail("prathikshashetty1535@gmail.com");
		System.out.println(student.getEmail());
		service.saveStudent(student);
		
		
	}

}
