package com.arrays;

import java.util.ArrayList;

public class RemoveDuplicates {

	public void removeDupinArray()
	{
	ArrayList al = new ArrayList();
	al.add(1);
	al.add(3);
	al.add(9);
	al.add("savitha");
	al.add(5);
	al.add(7);
	al.add(6);
	al.add(6);
	al.add("savitha");
    System.out.println("Before Removing duplicate:"+al);
	
	 for(int i=0;i<al.size();i++){
	        for(int j=i+1;j<al.size();j++){
	            if(al.get(i).equals(al.get(j))){ //gets in to loop only if it finds duplicate
	                al.remove(j); // removes the duplicate items
	                j--;  
	            }
	        }
	    }
	    System.out.println("After Removing duplicate:"+al);
	}	
	
	public static void main(String[] args) {


		RemoveDuplicates rd= new RemoveDuplicates();
		rd.removeDupinArray();
		
		
		
	}

}
