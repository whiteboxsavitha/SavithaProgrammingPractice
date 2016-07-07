package com.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordSearchinFile {

	public static int wordSearching(String keyword) throws IOException
	{
		int c=0;
			FileReader fr = new FileReader("resource/source");
			BufferedReader br=new BufferedReader(fr);
		//    System.out.println(keyword);
		    if(br.readLine().contains(keyword)) 
	    	{    	
		    	while ((br.readLine())!=null)
		    	{
		    		c=c+1;
				}
		    }
		    br.close();
		    fr.close();
		    
	return c;
	}
	public static void main(String args[]) throws Exception
	{
		String s="Java";
		int count = WordSearchinFile.wordSearching(s);
		System.out.println("The Count of occurance of the word " + s + " in the file is : " + count);
	}
}