package phase2;

public class ReverseString {

	public static void main(String[] args) {
		String s="java";
		StringBuilder rev= new StringBuilder();
		long start = System.nanoTime();
		System.out.println("starting time"+start);
		for(int i=s.length()-1;i>=0;i--)
		{
			rev.append(s.charAt(i));
		}
		long end = System.nanoTime();
		System.out.println("ending time"+end);
		System.out.println("total time taken for execution"+(end - start));
		System.out.println(rev);
	}
}
