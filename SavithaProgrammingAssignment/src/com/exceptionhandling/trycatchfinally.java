package com.exceptionhandling;

public class trycatchfinally {

	public static void main(String[] args) {
		try{
	        int a[]=new int[10];
	        //Array has only 10 elements
	        a[11] = 9;
	      }
	      catch(ArrayIndexOutOfBoundsException e){
	         //System.out.println ("ArrayIndexOutOfBounds");
	         System.err.println(e);
	      }
			finally
			{
				System.out.println("Exception caught");
			}
		
		
		// TODO Auto-generated method stub

	}

}
