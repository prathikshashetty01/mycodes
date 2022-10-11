package Collections;

public class Student implements Comparable {
		String sname;
		int age;
		public String toString()
		{
			return "name :"+sname+ " age:"+age;
		}

		Student(String sname,int age)
		{
			this.sname=sname;
			this.age=age;

		}

		@Override
		public int compareTo(Object o) {
			Student st= (Student)o;
			return this.age=st.age;
		}
}