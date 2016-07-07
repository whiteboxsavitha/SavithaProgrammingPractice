package com.strings;

public class CountCharacterOccurence {
	 public static void main(String[] args)
	    {
	        String s = "Java is java again java again";
	 
	        char c = 'a';
	 
	        int count = s.length() - s.replace("a", "").length();
	        String[] count1=s.split(" ");
	        //char charArray[] = s.toCharArray();
	        
	        /*for(int i =0; i<=s.length(); i++)
	        {
	        	
	        }*/
	 System.out.println(count1.length);
	 System.out.println(s.lastIndexOf("again"));
	 System.out.println(s.codePointAt(3));
	 System.out.println("COMAPRE TO IGNORE CASE" + s.compareTo("again"));
	 
	 
	 
	 //	 System.out.println(charArray.length);
	 
	 
	 
	     
	        
	     //   System.out.println("Number of occurances of 'a' in "+s+" = "+count);
	    }
}
