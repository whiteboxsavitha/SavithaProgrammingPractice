package com.collection;

import java.util.HashMap;


public class HashMapDemo {
	
	
	public static String HashMapkey(HashMap<Integer,String> set,int key)
	{
		
	//	System.out.println(key);
		//System.out.println(set);
		String Value = set.get(key);
		
		return Value;
		
	}

	public static void main(String[] args) {

		HashMap<Integer,String> set = new HashMap<Integer,String>();
		set.put(1,"savitha");
		set.put(2,"nishitha");
		set.put(8,"sucheth");
		set.put(6,"smitha");
		set.put(3,"latha");
		set.put(4,"ranjitha");
		set.put(7,"rashmintha");
		set.put(5,"rakshitha");
		
		
		String s = HashMapDemo.HashMapkey(set, 6);
		 System.out.println("The Value of hashmap fetched from key : " + s );
	}

}
