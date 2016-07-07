package com.collection;

import java.util.HashSet;

public class ArrayDuplicateItems {
	
	public static void main(String[] args) {

		String b[] = {"b1","b2","b2","b4","b6","b6", "b4", "b4"};
		System.out.println("Displaying Array duplicate elements");
		
		 HashSet<String> set = new HashSet<String>();
	        for (String arrayElement : b)
	        {
	            if(!set.add(arrayElement))
	            {
	              //  System.out.print(arrayElement + " ");
	            }
	        }
		System.out.println(set);
	}

}
