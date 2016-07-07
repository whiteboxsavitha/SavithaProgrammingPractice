package com.arrays;

import java.util.*;

//package com.loops;
public class SecondLargest
{
	/*
	 *       ######
	 *        ### 
	*/        
	
    public static void main(String args[])
    {
    /*//	int secondlargest = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter array values: ");
		int arr[] = new int[5];
		//int firstlargest = 0;	
		*/
    	int arr[] = {345,77,94,03,83};
    	int largest = 0;
    	int second = 0;
			
		for (int i = 0; i < arr.length; i++) {
			//arr[i] = input.nextInt();
		//	System.out.println( arr[i]);
				
			if (largest < arr[i]){ 
				second=largest;
				largest = arr[i];
			}
			if(second<arr[i] && largest != arr[i])
			{	
		
				second=arr[i];
			}
		}
		System.out.println("the largest number is " + largest);
		
			System.out.println("the second largest number is " + second);
			
    }}
