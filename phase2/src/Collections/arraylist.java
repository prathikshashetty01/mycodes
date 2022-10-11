package Collections;

import java.util.ArrayList;

public class arraylist {
	static ArrayList<String> alist = new ArrayList<>();
	public static void main(String[] args) {
		
		alist.add("prathiksha");
		alist.add("ram");
		alist.add("raj");
		alist.add("radha");
		alist.add("john");
		alist.add("emma");
		alist.add("emma");
		//System.out.println(alist);
		arraylist array = new arraylist();
		array.displaylist(alist);
		System.out.println("********");
		array.removeNameByPosition(2);
		array.displaylist(alist);
		System.out.println("********");
		array.removeNameByString("emma");
		array.displaylist(alist);
		System.out.println("********");
		array.modifyNames(1, "seetha");
		array.displaylist(alist);
		int position=array.search("prathiksha");
		System.out.println(position);
		System.out.println(alist.contains("prathiksha"));
	}
	void displaylist(ArrayList<String> names)
	{
		for(String name:names)
		{
			System.out.println(name);
		}
	}
	void removeNameByPosition(int position)
	{
		alist.remove(position);
	}
	void removeNameByString(String name)
	{
		alist.remove(name);
	}
	void modifyNames(int position,String name)
	{
		alist.set(position, name);
	}
	int search(String name)
	{
		return alist.indexOf(name);
	}
	boolean contain(String name)
	{
		return alist.contains(name);
	}

}
