package com.arrays;

public class ArraySort {
    public ArraySort()
    {
    }

    public static void bubbleSort(int a[], int n)
    {
        int t = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = 1; j < n - i; j++)
                if(a[j - 1] > a[j])
                {
                    t = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = t;
                }

        }
    }
    	public static void main(String[] args) {
		int array[] = { 12, 9, 4, 99, 120, 1, 3, 10};
	        System.out.println("Values Before the sort:\n");
	        for(int i = 0; i < array.length; i++)
	            System.out.print((new StringBuilder(String.valueOf(array[i]))).append("  ").toString());

	        System.out.println();
	        bubbleSort(array, array.length);
	        System.out.print("Values after the sort:\n");
	        for(int i = 0; i < array.length; i++)
	            System.out.print((new StringBuilder(String.valueOf(array[i]))).append("  ").toString());
	        	System.out.println();
	}

}
