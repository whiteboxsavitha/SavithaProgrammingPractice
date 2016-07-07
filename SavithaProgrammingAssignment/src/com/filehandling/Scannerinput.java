package com.filehandling;

import java.util.Scanner;

public class Scannerinput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter the integers");
		int a= sc.nextInt();
		
		System.out.println("Enter next integer");
		int b = sc.nextInt();
		sc.close();
		int sum = a + b;
	System.out.println("thie sum is " + sum);
	
	}

}
