package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	
	public static void main(String[] args) {
		
		HashMap<String,String> hm = new HashMap<>();
		
		//adding element to map
		 hm.put("101","savi");
		 hm.put("ps" ,"raj");
		 hm.put("ps", "nishu");
		 hm.put("ps", "chethu");
		 hm.put("105", "rashnu");
		 
		 System.out.println(hm);
		 
		 
		 //retrieve elements
		 for(@SuppressWarnings("rawtypes") Map.Entry m : hm.entrySet())
		 {
			 System.out.println(m.getKey() + " " + m.getValue());
		 }
		Set<String> s = hm.keySet();
		for(String i : s)
		{
			System.out.println(i);
		}
		 
		
		Collection<String> list = hm.values();
		for(String s1 : list)
		{
			System.out.println(s1);
		}
		 
		System.out.println(hm.get("105"));
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(200);
		list1.add(201);
		list1.add(202);
		
		
		/*for(Integer i : list1)
		{
			hm1.put(100, i);
		}*/
		
	}
	
}
