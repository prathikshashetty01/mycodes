package WrapperClass;

public class Demo {

	public static void main(String[] args) {
		int a=10;
		System.out.println(a);

		Integer obj= new Integer(120);
		System.out.println(obj);

		char ch='i';

		Character objj= new Character('A');
		System.out.println(objj);

		Boolean obj1= new Boolean(false);
		System.out.println(obj1);

		//auto boxing
		int b= 10;//primitive
		Integer obj2= new Integer(b);//non primitive
		//converting primitive to non primitive
		System.out.println(obj2);

		//auto unboxing
		Integer obj3 = new Integer(230);//non primitive
		int d= obj3;//primitive
		System.out.println(obj3);

		Double obj5= new Double(123.55);
		double abc= obj5;
		System.out.println(abc);


		String s = "1234";
		double ab= Integer.parseInt(s);//converting integer or double string to integer
		System.out.println(ab);

		String s3 = "false";
		boolean bo= Boolean.parseBoolean(s3);
		System.out.println(bo);
		}
}
