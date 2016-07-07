package com.filehandling;

import java.io.File;

public class ListofFilesinDir {

	public static void main(String[] args) {
	
	String dirPath = "C://SavithaWorkspace//SavithaProgrammingAssignment//src//com//arrays";
	File dir = new File(dirPath);
	File[] files = dir.listFiles();
	if (files.length == 0) {
	    System.out.println("The List of Files");
	} else {
	    for (File aFile : files) {
	        System.out.println(aFile.getName() + " - " + aFile.length());
	    }
	}
	

		// TODO Auto-generated method stub

	}

}
