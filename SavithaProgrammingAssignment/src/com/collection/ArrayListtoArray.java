package com.collection;

import java.util.ArrayList;

public class ArrayListtoArray {

public static void copyaltoar(ArrayList<String> al)
{
	String array[] = new String[al.size()];              
	for(int j =0;j<al.size();j++){
	  array[j] = (String) al.get(j);
	}

System.out.println("Displaying Array elements");
	for(String k: array)
	{
		System.out.println(k);
	}
}
	public static void main(String[] args) {
		
		
		ArrayList<String> al= new ArrayList<String>();
		al.add("String1");
		al.add("String2");
		al.add("String3");
		al.add("String4");
		ArrayListtoArray.copyaltoar(al);
		/*ArrayList to Array Conversion */
		}

}
