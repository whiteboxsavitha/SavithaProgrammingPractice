package com.filehandling;

	import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Bufferreaderinput {
	static int sub ;
	public static int Computesubtraction(String a,String b)
	{
		    int y = Integer.parseInt(a);
		    int z = Integer.parseInt(b);
		    
		    sub = y-z;
		
		
		return sub;
	}
	
	
	public static void main(String[] args) throws Exception {
	   
		System.out.println("Enter 2 Integers");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 String a= reader.readLine();
		    String b = reader.readLine();
		    
	   Bufferreaderinput.Computesubtraction(a, b);
	    System.out.println("Subtration : " + sub);
	    
	    reader.close();
	  }
	}

