package com.collection;

import java.util.HashMap;
import java.util.Map;


public class MapsortbyKey {

	

	public static void main(String[] args) {
	
		 HashMap<Integer,String> map= new HashMap<Integer,String>();
		 map.put(1,"savitha");
		 map.put(2,"nishitha");
		 map.put(5,"sucheth");
		 map.put(3,"smitha");
		 map.put(7,"latha");
		 map.put(6,"ranjitha");
		 map.put(9,"rashmintha");
		 map.put(8,"rakshitha");
		
		
		MapsortbyKey.testMapsorybyvalue(map);
	
	
	
	}
public static void testMapsorybyvalue(Map<Integer, String> map)
{

	


	for(Integer key: map.keySet())
{
	String value = map.get(key);
	System.out.println(key + value);
}

	}
}



