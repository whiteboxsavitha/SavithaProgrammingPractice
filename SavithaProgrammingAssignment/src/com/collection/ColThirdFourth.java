package com.collection;
/*3. Remove duplicates from List
     2 3 2 4 5 6 2 3
4. Remove duplicates from List and print the index from where the element is being removed from List


 * 
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ColThirdFourth{

	public static void main(String[] args) {

		ArrayList l = new ArrayList();
		
		l.add("1");
		l.add("2");
		l.add("1");
		l.add("5");
		l.add("three");
		l.add("four");
		l.add("four");
		l.add("5");
		

	    Object[] st = l.toArray();
	      for (Object s : st) {
	    	  //System.out.println(s);
	        if (l.indexOf(s) != l.lastIndexOf(s)) {
	        //	System.out.print(l.indexOf(s) + " :");
	        	//System.out.print(l.indexOf(s) != l.lastIndexOf(s));
	        	//System.out.println(":" + l.lastIndexOf(s));
		           
	        	l.remove(l.lastIndexOf(s));
	            System.out.println("the index of the duplicate elemet was at " + l.lastIndexOf(s));
	         }
	      }

	    System.out.println("List after eleminating Duplicates "+l);
	}

}
