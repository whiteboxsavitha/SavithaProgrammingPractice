// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Factorial.java

package com.loops;

import java.io.PrintStream;
import java.util.Scanner;

public class Factorial
{
    public static void main(String args[])
    {
        System.out.println("Enter the number to");
        n = sc.nextInt();
        sc.close();
        int result = factorialRecursive(n);
        System.out.println((new StringBuilder("The factorial of using Recursive ")).append(n).append(" is ").append(result).toString());
        nonrecursive();
    }

    public static void nonrecursive()
    {
        for(int i = 1; i <= n; i++)
            result *= i;

        System.out.println((new StringBuilder("The factorial of using Non-Recursive ")).append(n).append(" is ").append(result).toString());
    }

    public static int factorialRecursive(int n)
    {
        if(n == 0)
            return 1;
        else
            return n * factorialRecursive(n - 1);
    }

    static int n = 0;
    static Scanner sc;
    static int result = 1;

    static 
    {
        sc = new Scanner(System.in);
    }
}
