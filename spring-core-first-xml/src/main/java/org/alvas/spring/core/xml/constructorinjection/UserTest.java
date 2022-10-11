package org.alvas.spring.core.xml.constructorinjection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("constructorinjection.xml");
		User user =(User) applicationContext.getBean("myConstructor");
		System.out.println(user.id);
		System.out.println(user.name);
	}

}
;