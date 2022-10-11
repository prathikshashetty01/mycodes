package org.alvas.spring_core_xml_annotation.setter;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SportsTest {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotation.xml");
		Sports sports = (Sports) applicationContext.getBean("mySports");
		System.out.println(sports.getName());

	}

}
