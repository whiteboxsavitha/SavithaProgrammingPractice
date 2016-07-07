package com.filehandling;
import java.io.*;

public class DataInputStreamer {

	public static void main(String[] args) throws IOException {
	        DataOutputStream dataOutputStream =                 new DataOutputStream(
	                        new FileOutputStream("resource/res"));

	        dataOutputStream.writeInt(56432);
	        dataOutputStream.writeFloat(123.5F);
	        dataOutputStream.writeLong(75);

	        dataOutputStream.close();

	        DataInputStream dataInputStream = new DataInputStream(new FileInputStream("resource/res"));

	        int   i     = dataInputStream.readInt();
	        float f = dataInputStream.readFloat();
	        long  l    = dataInputStream.readLong();

	        dataInputStream.close();

	        System.out.println("int123     = " + i);
	        System.out.println("float12345 = " + f);
	        System.out.println("long789    = " + l);
	    }
	}

