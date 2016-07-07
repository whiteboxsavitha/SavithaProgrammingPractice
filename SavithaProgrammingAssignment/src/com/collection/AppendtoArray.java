package com.collection;

public class AppendtoArray {

	public static void addItemstoarray(String[] a)
	{
		
		String b[] = {"b1","b2","b3","b4","b5","b6"};
	System.out.println("Displaying Array elements");
	for(int j =0;j<a.length;j++){
			System.out.print(a[j] + ",");
			System.out.print(b[j]+ ",");
			}
		}
		public String ges(int a , int b)
		{
			System.out.println("savitha");
			
			return "savitha";
		}
		public int ges(int a , int b, int g)
		{
			System.out.println("savitha1");
			
			return 12;
		}
		
	public static void main(String[] args) {
		
		String[] a = {"a1", "a2" , "a3" , "a4" , "a5", "a6"};
		
		AppendtoArray.addItemstoarray(a);
		AppendtoArray ar = new AppendtoArray();
	
			ar.ges(3, 6, 2);
		ar.ges(4, 5);	
	}

}
