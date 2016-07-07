package com.general;

	import java.util.Scanner;

	 

	public class Bitwise_Addition 

	{

	    static int add(int x, int y)
	    {
	    	return x-~y-1;
			        /*int carry;
		
			        while(y!=0)
		
			        {
		
			            carry = x & y;
		
			            x = x ^ y;
		
			            y = carry << 1;
		
			        }
		
			        return x;
		
*/	    }

	    public static void main(String args[])

	    {

	        Scanner input = new Scanner(System.in);

	        System.out.println("Enter the numbers to be added:");

	        int x = input.nextInt();

	        int y = input.nextInt();

	        System.out.println("The Summation is: "+add(x, y));

	        input.close();

	    }

	
	
}
