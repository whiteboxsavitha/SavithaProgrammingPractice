package com.filehandling;
import java.io.*;
import java.lang.String;

public class WordReplace {
	public static File file;
	public static void main(String args[])
	{    file = new File("resource/source");
    	boolean trf = WordReplace.WordReplaceinFile(file, "tre", "JAVA8");
	System.out.println(trf);
	}
	public static boolean WordReplaceinFile(File f, String o, String n)
	{
		boolean b=false;
		try
        {
        BufferedReader reader = new BufferedReader(new FileReader(f));
        String line = "", oldtext=""; 
        		
        while((line = reader.readLine()) != null)
            {
       	 	oldtext += line + "";
            b=true;
            }
        	reader.close();
        	// replace a word in a file
        	String newtext = oldtext.replaceAll(o,n);

        	//To replace a line in a file
        	//String newtext = oldtext.replaceAll("This is test string 20000", "blah blah blah");
        	
        	FileWriter writer = new FileWriter("resource/source");
        	writer.write(newtext);
        	writer.close();
        	System.out.println("Text Replaced");
        }
		 	catch (IOException e)
        	{
		 		e.printStackTrace();
        	}
		return b;
	}
}
	
	

