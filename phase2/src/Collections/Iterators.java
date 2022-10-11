package Collections;

import java.util.ArrayList;
import java.util.Iterator;


public class Iterators {

	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		Iterator i= obj.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
