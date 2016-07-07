// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   FibinocciSeries.java

package com.loops;

import java.io.PrintStream;
import java.util.Scanner;

public class FibinocciSeries
{
    public static void main(String args[])
    {
        int nutoprint = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to");
        nutoprint = sc.nextInt();
        sc.close();
        int current = 1;
        int last = 0;
        System.out.println(last);
        System.out.println(current);
        int lstno = 0;
        for(int i = 0; i <= nutoprint; i++)
        {
            lstno = last;
            last = current;
            current = last + lstno;
            System.out.println(current);
        }

    }
}
