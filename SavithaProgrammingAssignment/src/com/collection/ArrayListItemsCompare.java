package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListItemsCompare {
	static ArrayList <String> a1 = new ArrayList<>();
    
	public static void main(String[] args) {

		  a1.add("Zara");
	      a1.add("Mahnaz");
	      a1.add("Ayan");
	      a1.add("Mahnaferz");
	      a1.add("Ayan");
	 
ArrayListItemsCompare.sameSize();
	}
		public static boolean sameSize()
	      {
			ListIterator ls = a1.listIterator();
			int count = 0;
			   Set e = new TreeSet();    
		    	
			  for(String s : a1)
		      {
		    	   for(String r : a1)
				      {
		    		   		a1.listIterator();
		    		   	count++;
		  			  if(s.length() == r.length()){
		  				 if(!s.contentEquals(r)){
		  				  System.out.println(" The Items : " + s + r);
		    		   e.add(s);}
		  			  }
		    		  }
	
		    		   	}
		    	   System.out.println(e);
			return false;
	      }
	    }
