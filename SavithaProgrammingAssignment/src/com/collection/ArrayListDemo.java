package com.collection;

import java.util.*;

public class ArrayListDemo {
	   static ArrayList<String> al = new ArrayList<String>();
	public static void arraylist()
	{
		// create an array list
	   
	      System.out.println("Initial size of al: " + al.size());

	      // add elements to the array list
	      al.add("C");
	      al.add("A");
	      al.add("E");
	      al.add("B");
	      al.add("D");
	      al.add("F");
	      al.add(1, "A2");
	      System.out.println("ArrayList content " + al);
	 
	      //Search for an element 
	      System.out.println("ArrayList Contains E : " + al.contains("E"));
	      System.out.println("ArrayList does not contain Y :" + al.contains("E"));
	      // display the array list
	      //System.out.println("Contents of al: " + al);
	      // Remove elements from the array list
	      al.remove("F"); // elements value
	      al.remove(2);   // element index
	      System.out.println("Size of al after deletions: " + al.size());
	      System.out.println("Contents of al: " + al);

	      System.out.println("Iterate Demo :");
	      Iterator<String> iterator = al.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
				System.out.println("Iterate reverse Demo :");
			ListIterator<String> listIter = al.listIterator(al.size());
			while (listIter.hasPrevious()) {
			    String prev = listIter.previous();
			    System.out.println(prev);
			   }
	     }
	public static void main(String args[]) {
		ArrayListDemo.arraylist();
		}
}