// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   NumberSwap.java

package com.loops;

import java.io.PrintStream;
import java.util.Scanner;

public class NumberSwap
{
    public static void notemp()
    {
        temp = firstno;
        firstno = secondno + firstno;
        secondno = firstno - secondno;
        firstno -= secondno;
        System.out.println((new StringBuilder("The numbers are swaped now ")).append(firstno).append(" and ").append(secondno).toString());
    }

    public static void withTemp()
    {
        temp = firstno;
        firstno = secondno;
        secondno = temp;
        System.out.println((new StringBuilder("The numbers are swaped now ")).append(firstno).append(" and ").append(secondno).toString());
    }

    public static void main(String args[])
    {
        System.out.println("Enter the First Number : ");
        firstno = sc.nextInt();
        System.out.println("Enter the Second Number : ");
        secondno = sc.nextInt();
        sc.close();
        notemp();
    }

    static Scanner sc;
    static int firstno = 0;
    static int secondno = 0;
    static int temp = 0;

    static 
    {
        sc = new Scanner(System.in);
    }
}
