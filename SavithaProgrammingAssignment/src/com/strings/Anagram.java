package com.strings;

import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Anagram {

	public boolean isAnagram(String s1, String s2)
	{
		char[] allch = new char[256];
		
		boolean flag= false;
		for(int i=0; i<s1.length(); i++)
		{
			char[] f = s1.toCharArray();
			char[] s = s2.toCharArray();
			Arrays.sort(f);
		
			Arrays.sort(s);
			if(f.equals(s)
					flag = true;	
					
			}
		
		return false;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
