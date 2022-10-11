package Exceptionhandling;

public class Handling 
{
	public void nullPointer() {
		String s=null;
		System.out.println(s.charAt(0));
	}
	public static void main(String[] args) {
	Handling obj=new Handling();
	try
	{
		obj.nullPointer();
	}
	catch(NullPointerException e)
	{
		System.out.println(e.getMessage());
	}
}
}