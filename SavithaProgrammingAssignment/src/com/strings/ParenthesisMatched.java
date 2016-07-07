package com.strings;

import java.io.PrintStream;
import java.util.Stack;

public class ParenthesisMatched
{
	public static boolean CheckParentesis(String str)
    {
        if(str.isEmpty())
            return true;
        Stack stack = new Stack();
        for(int i = 0; i < str.length(); i++)
        {
            char current = str.charAt(i);
            if(current == '{' || current == '(' || current == '[')
                stack.push(Character.valueOf(current));
            if(current == '}' || current == ')' || current == ']')
            {
                if(stack.isEmpty())
                    return false;
                char last = ((Character)stack.peek()).charValue();
                if(current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
                    stack.pop();
                else
                    return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String args[])
    {
        String str = "({{savitha}})";
        System.out.println(CheckParentesis(str));
    }
}
