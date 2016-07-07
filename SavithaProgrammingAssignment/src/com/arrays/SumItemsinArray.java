package com.arrays;

public class SumItemsinArray {

	public static void main(String[] args) {
int[] a = {1,2,5,4,6,7,3,3,4};
		for(int i =0 ; i<=a.length; i++)
		{
			for(int j =i; j<a.length; j++)
			{
				if(a[i] + a[j] == 10 && i!=j)
				{
					System.out.println(i +" " + j);
				}
				
			}
		}
		
		// TODO Auto-generated method stub

	}

}
