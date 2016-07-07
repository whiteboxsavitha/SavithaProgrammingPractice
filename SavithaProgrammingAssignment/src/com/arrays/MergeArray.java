package com.arrays;

import java.io.PrintStream;

public class MergeArray
{

    public MergeArray()
    {
    }

    public static void main(String args[])
    {
        String first[] = {
            "first1", "first2", "first3", "first4"
        };
        String second[] = {
            "second1", "second2", "second3", "second4"
        };
        String merged[] = new String[first.length + second.length];
        for(int i = 0; i < merged.length; i++)
        {
            merged[i] = i >= first.length ? second[i - first.length] : first[i];
            System.out.println(merged[i]);
        }
        System.out.println("Array Merged");
        
    }
}
