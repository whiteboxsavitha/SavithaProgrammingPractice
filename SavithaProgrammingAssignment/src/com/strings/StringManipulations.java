
package com.strings;

import java.io.PrintStream;

public class StringManipulations
{
    public static void main(String args[])
    {
        String str = "Hello!";
        char charArray[] = str.toCharArray();
        int indexOfLastChar = charArray.length - 1;
        for(int i = 0; i < charArray.length / 2; i++)
        {
           char temp = charArray[i];
          charArray[i] = charArray[indexOfLastChar - i];
          charArray[indexOfLastChar - i] = temp;
        }

        String reversedStr = new String(charArray);
        System.out.println((new StringBuilder("The reverse of the string \"")).append(str).append("\" is \"").append(reversedStr).append("\".").toString());
    }
}
