
package com.strings;

import java.io.PrintStream;

public class StringappendCount
{
    public static String appendcountword(String sentence)
    {
    	int wordscount=0;
    	String[] words = sentence.split(" ");
    	String temp="";
    	int count=0;
    	System.out.println(sentence);
    	for (String word : words)
    	{
    		count++;
    		temp += word + count+ " ";
    	}  
    	
    	return temp;
    }

    public static void main(String args[])
    {
    String changed=	appendcountword("This is nice");
	System.out.println(changed);
    }
}
