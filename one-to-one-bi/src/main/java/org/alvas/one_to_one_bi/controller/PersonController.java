package org.alvas.one_to_one_bi.controller;

import org.alvas.one_to_one_bi.dao.PersonDao;
import org.alvas.one_to_one_bi.dto.Pan;
import org.alvas.one_to_one_bi.dto.Person;

public class PersonController {

	public static void main(String[] args) {
		PersonDao dao = new PersonDao();
		Person person = new Person();
		Pan pan = new Pan();
		pan.setPannnumber("mnwdghw8");
		pan.setPanaddress("hyderabad");
		person.setPersonName("ram");
		person.setPersonEmail("ram@gmail.com");
		pan.setPerson(person);
		dao.savePerson(person,pan);
	}

}
