package Collections;

import java.util.LinkedList;

public class linkedlist {
	
	public static void main(String[] args) {
		LinkedList<Student> obj=new LinkedList();
		Student s= new Student("java", 20);
		Student s2=new Student("html",32);
		Student s3= new Student("css",40);
		Student s4=new Student("JS",12);
		obj.add(s);
		obj.add(s2);
		obj.add(s3);
		obj.add(s4);
		
		System.out.println(obj);
		for(Student obj1 : obj)
		{
			System.out.println(obj1.age);
		}
	}

}
