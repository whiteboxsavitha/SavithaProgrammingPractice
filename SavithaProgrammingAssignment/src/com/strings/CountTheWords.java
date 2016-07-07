package com.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class CountTheWords
{
	public int findMaximumRepeatedChar(String str){
		char p[]=str.toCharArray();
		int count =0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i =0; i<=str.length()-1; i++)
		{
			for(int j =0; j<=str.length()-1; j++)
			{
				if(p[i] == p[j] && i != j)
					map.put(p[i], i);
					
					
				
			}
	   		
		}
   
		return count;     
}
	public static void main(String[] args)
    {
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
       CountTheWords cc = new CountTheWords();
       cc.findMaximumRepeatedChar(s);
        int ch = cc.findMaximumRepeatedChar(s);
        System.out.println(ch);
    }
}