package Collections;

import java.util.ArrayList;

import java.util.Iterator;

public class Iterators2 {

	public static void main(String[] args) {
		ArrayList obj1=new ArrayList<>();
		Student s1=new Student("java",20);
		Student s2=new Student("html",30);
		Student s3=new Student("c++",40);
		Student s4=new Student("js",45);
		obj1.add(s1);
		obj1.add(s2);
		obj1.add(s3);
		obj1.add(s4);
		System.out.println(obj1);
		Iterator<Student> it = obj1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}	
	}
}
