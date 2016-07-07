// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PrimeNoCheck.java

package com.loops;

import java.io.PrintStream;
import java.util.Scanner;

public class PrimeNoCheck
{
    public static void main(String args[])
    {
        boolean isPrime = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number for check:");
        int num = scan.nextInt();
        for(int i = 2; i <= num / 2; i++)
        {
            int temp = num % i;
            if(temp != 0)
                continue;
            isPrime = false;
            break;
        }

        if(isPrime)
            System.out.println((new StringBuilder(String.valueOf(num))).append(" is Prime Number").toString());
        else
            System.out.println((new StringBuilder(String.valueOf(num))).append(" is not Prime Number").toString());
    }
}
