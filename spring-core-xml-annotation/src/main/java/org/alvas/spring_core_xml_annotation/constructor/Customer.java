package org.alvas.spring_core_xml_annotation.constructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "myCustomer")
public class Customer {
	int id;
	String name;

	public Customer(@Value(value = "200") int id,@Value(value = "rina") String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void print()
	{
		System.out.println(id);
		System.out.println(name);
	}
}
