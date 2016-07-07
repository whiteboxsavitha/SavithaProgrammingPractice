// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   StarPattern.java

package com.loops;

import java.io.PrintStream;

public class StarPattern
{
    public static void main(String args[])
    {
        System.out.println("The Pattern is");
        for(int i = 0; i < 6; i++)
        {
            for(int j = 0; j < 6; j++)
                if(j <= i)
                    System.out.print("*");
                else
                    System.out.print("  ");

            System.out.println();
        }

    }
}
