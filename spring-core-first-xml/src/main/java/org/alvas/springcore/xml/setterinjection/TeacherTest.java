package org.alvas.springcore.xml.setterinjection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeacherTest {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("setterinjection.xml");
		Teacher teacher =(Teacher) applicationContext.getBean("myConstructor2");
		System.out.println(teacher.getId());
		System.out.println(teacher.getName());
		System.out.println(teacher.getSubject());
	}

}
