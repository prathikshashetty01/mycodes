package org.alvas.spring_core2.xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		BeanFactory beanFactory= new ClassPathXmlApplicationContext("person.xml");
		Person person = (Person) beanFactory.getBean("person");
		person.getPerson();
	}

}
