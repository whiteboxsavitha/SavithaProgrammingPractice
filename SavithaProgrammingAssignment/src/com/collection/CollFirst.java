package com.collection;

/*
 * 
 * 1.write a program to create List with List of strings - iterate and display the values.
 * 
 * 
 */


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollFirst
{
public static void main(String[] args)
{
ArrayList<ArrayList<String>> listOLists = new ArrayList<ArrayList<String>>();
ArrayList<String> firstList = new ArrayList<String>();
firstList.add("First item in first list");
firstList.add("second item in first list");

ArrayList<String> secondList = new ArrayList<String>();
secondList.add("1st item in second list");
secondList.add("2nd item in second list");

listOLists.add(firstList);
listOLists.add(secondList);

for(int i = 0; i<firstList.size();i++)
{
	for(int j = 0; j<secondList.size();j++)
	{
	
System.out.println(listOLists.get(i).get(j));
}
}

}



}
