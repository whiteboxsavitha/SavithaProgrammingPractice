// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Commandlineinput.java

package com.loops;

import java.io.PrintStream;

public class Commandlineinput
{
    public static void main(String args[])
    {
        for(int i = 0; i < args.length; i++)
            System.out.println((new StringBuilder("The String u passed is  ")).append(args[i]).toString());

    }
}
