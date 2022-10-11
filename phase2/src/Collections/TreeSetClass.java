package Collections;

import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		StudentIdComparator obj = new StudentIdComparator();
		TreeSet<Student> ts = new TreeSet(obj);
		Student s1 = new Student("java",20);
		Student s2= new Student("html",30);
		Student s3 = new Student("css",10);
		Student s4 = new Student("js",40);
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		System.out.println(ts);
	}

}
