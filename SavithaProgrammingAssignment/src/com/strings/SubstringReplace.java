
package com.strings;

import java.io.PrintStream;

public class SubstringReplace
{
    public static void main(String args[])
    {
        String sentence = "savitha nejanthi";
        if(sentence.contains("nejanthi"))
        {
            sentence = sentence.replace("nejanthi", "raj");
            System.out.println(sentence);
        }
    }
}
