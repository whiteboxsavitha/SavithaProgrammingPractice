package com.strings;

public class RemoveSpace {

	public static void main(String args[])
	{
		RemoveSpace.RemoveSpaceString("Savitha Savitha Savitha");	
	}

public static String RemoveSpaceString(String s) {

	 String withoutspaces = "";
	    for (int i = 0; i < s.length(); i++) {
	        if (s.charAt(i)== ' ' )
	            withoutspaces += s.charAt(i);
	        //		s.charAt[i] = " ";
	    }
	    return withoutspaces;

}
//return new String(c);
}



