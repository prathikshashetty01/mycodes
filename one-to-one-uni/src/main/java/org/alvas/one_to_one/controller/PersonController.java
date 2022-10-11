package org.alvas.one_to_one.controller;

import java.util.Scanner;

import org.alvas.one_to_one.dao.PersonDao;
import org.avlas.one_to_one.dto.Aadhar;
import org.avlas.one_to_one.dto.Person;

public class PersonController {
	static Person person = new Person();
	static Aadhar aadhar = new Aadhar();
	static PersonDao dao = new PersonDao();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("1.SavePersonAadhar");
			System.out.println("2.get details");
			System.out.println("3.delete by id");
			System.out.println("4.update");
			System.out.println("enter your choice");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				aadhar.setAadharnumber(254534664);
				aadhar.setAddress("mangalore");
				person.setName("shravya");
				person.setEmail("shravya@gmail.com");
				person.setAadhar(aadhar);
				dao.savePerson(person, aadhar);
			}
				break;
			case 2: {
				Person person = dao.getPersonAadhar(2);
				System.out.println("personal details");
				System.out.println(person.getId() + "\t" + person.getEmail() + "\t" + person.getName());
				System.out.println("aadhar details");
				System.out.println(person.getAadhar().getId());
				System.out.println(person.getAadhar().getAadharnumber());
				System.out.println(person.getAadhar().getAddress());
			}
				break;
			case 3: {
				Person person = dao.deletById(2);
				System.out.println(person);
			}
				break;
			case 4: {
				System.out.println("enter the person id");
				int id = scanner.nextInt();
				System.out.println("enter the person name");
				String name = scanner.next();
				System.out.println("enter the aadhar number");
				long aadharnumber = scanner.nextLong();
				Person person = dao.UpdateById(id, name, aadharnumber);
				System.out.println(person);
			}

			}
		}

	}
}
