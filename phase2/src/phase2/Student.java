package phase2;

import java.io.Serializable;

public class Student implements Serializable {
	String studentName;
	int age;
	Student()
	{
		
	}
	Student(String studentName,int age)
	{
		this.age=age;
		this.studentName=studentName;
		
	}

}
