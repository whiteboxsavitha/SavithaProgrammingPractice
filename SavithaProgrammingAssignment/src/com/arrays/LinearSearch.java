package com.arrays;


import java.io.PrintStream;
import java.util.Scanner;

public class LinearSearch
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int num = input.nextInt();
        int array[] = new int[num];
        System.out.println((new StringBuilder("Enter ")).append(num).append(" integers").toString());
        int counter;
        for(counter = 0; counter < num; counter++)
            array[counter] = input.nextInt();

        System.out.println("Enter the search value:");
        int item = input.nextInt();
        for(counter = 0; counter < num; counter++)
        {
            if(array[counter] != item)
                continue;
            System.out.println((new StringBuilder(String.valueOf(item))).append(" is present at location ").append(counter + 1).toString());
            break;
        }

        if(counter == num)
            System.out.println((new StringBuilder(String.valueOf(item))).append(" doesn't exist in array.").toString());
    }
}
