package com.strings;

import java.util.*;
public class MaxOcc{
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
	System.out.println("Enter the String");
		String c = ab.nextLine();
		
		ab.close();
		char gg = MaxOcc.retMaxC(c);
	System.out.println(gg);
	}	
	public static char retMaxC(String c)
	{
		int[] a = new int[c.length()];
			char k;
			int d,big=0,loc=0;
			for(int i=0;i<a.length;i++)
			{
				k=c.charAt(i);
				d=0;
				for(int j=0;j<a.length;j++)
				{
					if(c.charAt(j)== k)
						d++;
				}
				a[i]=d;
			}
			for(int l=0;l<a.length;l++)
			{
				if(a[l]>big)
				{
					big=a[l];
					loc=l;
				}
			}
			return c.charAt(loc);
			
			//System.out.print("Highest ocurring character is "+c.charAt(loc)+" occuring times"+big);
	}
}