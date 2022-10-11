package org.alvas.spring_core_xml_annotation.setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "mySports")
public class Sports {
	String name;

	public String getName() {
		return name;
	}
	@Value(value = "tennis")
	public void setName(String name) {
		this.name = name;
	}
	

}
