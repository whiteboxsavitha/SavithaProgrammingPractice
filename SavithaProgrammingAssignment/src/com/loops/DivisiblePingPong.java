// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DivisiblePingPong.java

package com.loops;

import java.io.PrintStream;
import java.util.Scanner;

public class DivisiblePingPong
{    public static void main(String args[])
    {
        System.out.println("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        int theno = sc.nextInt();
        sc.close();
        if(theno % 2 == 0)
            System.out.println("The number is divisible by 2: Ping");
        else
        if(theno % 5 == 0)
            System.out.println("The number is divisible by 5: Pong");
        else
        if(theno % 2 == 0 || theno % 5 == 0)
            System.out.println(" PING PONG");
        else
            System.out.println(theno);
    }
}
