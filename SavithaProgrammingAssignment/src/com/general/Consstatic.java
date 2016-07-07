package com.general;

public class Consstatic {
	int a=6;


	
	static {
		System.out.println("static");
		
	}

	
	public Consstatic(int a) {
		super();
		this.a = a;
		System.out.println("constructor");
	}
	public static void Constatcmethod()
	{
		System.out.println("method");
	}
	
	public static void main(String[] args) {
	
		Consstatic.Constatcmethod();
	  new Consstatic(5);	
	}

}
