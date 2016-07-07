// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ArmstrongCheck.java

package com.loops;

import java.io.PrintStream;
import java.util.Scanner;

public class ArmstrongCheck
{
    public static void main(String args[])
    {
        int sum = 0;
        int digits = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number to check if it is an Armstrong number");
        int n = in.nextInt();
        for(int temp = n; temp != 0; temp /= 10)
            digits++;

        for(int temp = n; temp != 0; temp /= 10)
        {
            int remainder = temp % 10;
            sum += power(remainder, digits);
        }

        
        
        
        
        if(n == sum)
            System.out.println((new StringBuilder(String.valueOf(n))).append(" is an Armstrong number.").toString());
        else
            System.out.println((new StringBuilder(String.valueOf(n))).append(" is not an Armstrong number.").toString());
    }

    static int power(int n, int r)
    {
        int p = 1;
        for(int c = 1; c <= r; c++)
            p *= n;

        return p;
    }
}
