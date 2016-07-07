package com.oops;

public class Inheritance {

public int a;
public int b;


///=====Method overloading example
public static int addnumbers(int x, int y)
{ int sum = x + y; 	return sum; }
	
public static  int addnumbers(int x, int y, int z)
{ 	int sum = x + y + z; return sum; }
	
///=====Methodoverriding example

public static class MethodOverriding{
public static int multiplynumbers(int a, int b)
{ int result = a*b; return result; }
}

	
	public static void main(String[] args) {
		
		
		// method overloading
		int sum= Inheritance.addnumbers(6,7);
		System.out.println("Method OverLoading 2 parameters :" + sum);
		sum= Inheritance.addnumbers(6, 7, 8);
		System.out.println("Method OverLoading 3 parameters :" + sum);
		
		//method overriding
		MethodOverriding firstobject= new MethodOverriding();
		MethodOverriding secondobject= new MethodOverriding();
		System.out.println(firstobject.multiplynumbers(5, 7)+" result from firstobject");
		System.out.println(secondobject.multiplynumbers(6, 2) +" result from secondobject");
	
		
		
	}

}
