package com.filehandling;

import java.io.File;
import java.nio.file.Files;

import java.io.IOException;

public class Copyfiletofile {

	private static void copysourcetodest(File source, File dest)

	            throws IOException {
	        Files.copy(source.toPath(), dest.toPath());

	    }

	
	public static void main(String[] args) {
		
		
		File source = new File("resource/source");
		File dest = new File("resource/dest");

		try {
			Copyfiletofile.copysourcetodest(source, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub

	}

}
