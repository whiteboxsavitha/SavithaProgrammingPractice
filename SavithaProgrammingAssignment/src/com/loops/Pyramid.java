package com.loops;
/**
 * Created by Savi on 5/21/2016.
 */
public class Pyramid
{
    public static void main(String args[])
    {
        for(int i=0;i<5;i++) 
        {
             for(int j=0;j<5-i;j++) 
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++) 
            {
                System.out.print("$ ");
            }
            System.out.println();
        }
    }
}

