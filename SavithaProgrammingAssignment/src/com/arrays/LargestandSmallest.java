package com.arrays;

public class LargestandSmallest {
	  public static void main(String[] args) 
	  { 
		  //array of 10 numbers 
		  int numbers[] = new int[]{32,43,53,54,32,65,63,98,43,23}; 
		  //assign first element of an array to largest and smallest 
	
		  int smallest = 0; 
		  int largest = 0; 
		  for(int i=1; i< numbers.length; i++) 
		  { 
			  if(numbers[i] > largest) 
				  largest = numbers[i]; 
			  else if (numbers[i] < smallest) 
				  smallest = numbers[i]; 
		  } 
		  System.out.println("Largest Number is : " + largest); 
		  System.out.println("Smallest Number is : " + smallest); 
		  } 
	  }
	  