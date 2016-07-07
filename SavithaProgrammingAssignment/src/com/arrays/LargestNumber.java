package com.arrays;

public class LargestNumber
{
    public static int findLargestNumber(int arry[])
    {
        int largetst = arry[0];
        for(int i = 1; i < arry.length; i++)
            if(arry[i] > largetst)
                largetst = arry[i];
		return largetst;
    }

    public static void main(String args[])
    {
    	int numbers[] = { 32, 43, 52, 67, 12, 5, 7, 53, 54, 32, 65, 63, 98, 43, 23 };    
        int Largest = LargestNumber.findLargestNumber(numbers);    
        System.out.println((new StringBuilder("Largest Number is : ")).append(Largest).toString());

//    System.out.println("Largest Number is : ");
    }
}
