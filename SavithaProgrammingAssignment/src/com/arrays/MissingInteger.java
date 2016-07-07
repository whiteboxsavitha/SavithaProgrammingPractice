package com.arrays;


import java.io.PrintStream;

public class MissingInteger
{
    public static void FindMissing(int finalArray[], int len)
    {
        int sum = 0;
        for(int x = 0; x < len; x++)
            sum += finalArray[x];

        int totalNumber = ((len + 1) * (len + 2)) / 2;
        int missingInt = totalNumber - sum;
        System.out.println((new StringBuilder("The missing integer is ")).append(missingInt).append(".").toString());
    }

    public static void main(String args[])
    {
        int finalArray[] = {
            1, 2, 3, 4, 5, 7, 8, 9, 10
        };
        int len = finalArray.length;
        FindMissing(finalArray, len);
    }
}
