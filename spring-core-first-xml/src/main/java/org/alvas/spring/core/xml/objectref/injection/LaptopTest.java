package org.alvas.spring.core.xml.objectref.injection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopTest {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext= new ClassPathXmlApplicationContext("object-ref-setterinjection.xml");
		Laptop laptop = (Laptop) applicationContext.getBean("myLaptop");
		laptop.getLaptop();
		

	}

}
