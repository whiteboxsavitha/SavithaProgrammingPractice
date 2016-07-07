package com.arrays;
import java.io.PrintStream;
import java.util.List;
import java.util.ArrayList;


public class CommonNumbersinArray
{
    @SuppressWarnings("rawtypes")
	public static List findCommon(int arr1[], int arr2[])
    {
    	@SuppressWarnings("rawtypes")
		List temp= new ArrayList();
    	for(int i = 0; i < arr1.length; i++)
            {
   	                for(int j = 0; j < arr2.length; j++)
                    if(arr1[i] == arr2[j]) {
                   	temp.add(arr1[i]);
           //      	System.out.println(arr1[i]);
                   }
            }
	return temp;
}
    public static void main(String a[])
    {
    	int arry1[] = {4,6,11,2,7,10};
    	int arry2[] = {2,12,9,7,10};
    	List<Integer> common=CommonNumbersinArray.findCommon(arry1,arry2);
    	System.out.println("The Common Numbers are : ");
    	for (int i = 0; i < common.size(); i++) 
    	{
    		System.out.println(common.get(i));
    	}
    
    }
}
