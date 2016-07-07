package com.strings;


public class NonRepeatingChar {

	
	public static char findNonRepeateChar(String str) 
	{
		Character ch = null; 
			int i=0;
			for( ;i<str.length()-1;i++ )
			{
			ch =str.charAt(i);
				if(!(str.substring(i+1).contains(ch.toString()) || str.substring(0,i).contains(ch.toString()) ))
				{ 
					System.out.println("First Non-repeated character is:   "+ch);

					break;
				}
			}
			if(i==str.length()-1)
			{
				System.out.println("No Non-repeated character ");
			}
			return ch;
	
	}
			

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			NonRepeatingChar.findNonRepeateChar("avitha");
	}

}
