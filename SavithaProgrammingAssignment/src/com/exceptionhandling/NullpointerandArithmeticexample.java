package com.exceptionhandling;

public class NullpointerandArithmeticexample
{
	
	public static String nullpointertry(String a, String b)
	{  	try {
	  a.trim(); b.toUpperCase();
	}
	catch(NullPointerException e)
	{
		//System.out.println("Caught Exception");
	//System.err.println(e);
	}
		return a;
	}
	
	public static void arithmetictry()
	{
		
		 try{
	         int num1=30, num2=0;
	         int output=num1/num2;
	         //System.out.println ("Result = " +output);
	      }
	      catch(ArithmeticException e){
	      //   System.out.println ("Arithmetic Exception: You can't divide an integer by 0");
	        System.err.println(e);
	      }
		
			   }
		
	
	public static void arrayoutofbound()
	{
		try{
	        int a[]=new int[10];
	        //Array has only 10 elements
	        a[11] = 9;
	      }
	      catch(ArrayIndexOutOfBoundsException e){
	//       System.out.println ("ArrayIndexOutOfBounds");
	       System.err.println(e);
	      }

		
	}
	
	
	public static void main(String[] args) {
		//String s = NullpointerandArithmeticexample.nullpointertry("sar", null);
		//System.out.println(s);
		NullpointerandArithmeticexample.arithmetictry();
		
		NullpointerandArithmeticexample.arrayoutofbound();
	
		//NullpointerandArithmeticexample.
	
	}
}