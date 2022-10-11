package phase2;

public class CharCount {

 	public static void main(String[] args) {
		String s="hello";
		char ch='l';
		int count = 0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='l')
			{
				count++;
			}
		}
		System.out.println(ch +" has occured "+count+" number of times ");	
	}
}
