package Collections;

import java.util.HashMap;
import java.util.Set;

public class hashmapclass {

	public static void main(String[] args) {
		HashMap hm= new HashMap<>();
		hm.put(1,"java");
		hm.put(2,"css");
		hm.put(3,"html");
		hm.put(4,"js");
		hm.put("hii","hello");
		System.out.println(hm.get(0));
		System.out.println(hm.get("hii"));
		System.out.println(hm.containsKey(2));
		System.out.println(hm.containsValue("hello"));
		System.out.println(hm.keySet());
		Set s = hm.keySet();
		for(Object key: s)
		{
			System.out.println(key+ "-->" +hm.get(key));
		}
	}

}
