package com.alvas.hibernatedemo;

import java.util.Scanner;

public class TeacherMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TeacherDao dao= new TeacherDao();
		Teacher teacher = new Teacher();
		System.out.println("enter the teacher id");
		teacher.id=scanner.nextInt();
		System.out.println("enter teacher name");
		teacher.name=scanner.next();
		System.out.println("enter subject name");
		teacher.subname=scanner.next();
		Teacher teacher2 =dao.saveTeacher(teacher);
//		Teacher teacher2 =dao.updateTeacher(teacher);
//	Teacher teacher2 =dao.deleteTeacher(teacher);
		if(teacher2!=null)
		{
			System.out.println("data stored");
		}
		else
		{
			System.out.println("check your data");
		}

}
}
