package phase2;

public class StringClass {

	public static void main(String[] args) {
		String s1="hello";
		String s2="";
		char ch;
		System.out.println(s1);
		for(int i=0;i<s1.length();i++)
		{
			ch=s1.charAt(i);
			s2=ch+s2;
		}
		System.out.println("reversed string is "+s2);
	}
}
