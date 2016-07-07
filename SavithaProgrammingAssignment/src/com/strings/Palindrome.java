package com.strings;


import java.io.PrintStream;

public class Palindrome
{

    public static boolean isPalindrome(String original)
    {
        int i = original.length() - 1;
        for(int j = 0; i > j; j++)
        {
            if(original.charAt(i) != original.charAt(j))
                return false;
            i--;
        }

        return true;
    }
    public static void main(String args[])
    {
        Palindrome pn = new Palindrome();
        if(pn.isPalindrome("ABrteBA"))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    
}
