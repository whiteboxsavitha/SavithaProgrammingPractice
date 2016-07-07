package com.strings;

public class ReverseString 
{
	private static String hello = "Hello World";

public static void main(String[] args)
{
	System.out.println(reverseString(hello));
}

public static String reverseString(String s) 
{
	if(s.length() == 1)
	{
		return s;
	}
	else
	{
		return s.charAt(s.length()-1) + reverseString(s.substring(1, s.length()-1))+ s.charAt(0);
	}
	}}