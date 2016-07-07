package com.collection;

import java.util.*;

public class LinkedListDemo {

   public static void main(String[] args) {

   // create a LinkedList
   LinkedList list = new LinkedList();

   // add some elements
   list.add("Hello");
   list.add(2);
   list.add("Chocolate");
   list.add("10");

   // print the list
   System.out.println("LinkedList:" + list);

   // print the size of the list
   System.out.println("List size:" + list.size());

   // add 2 more elements
   list.add("Coffee");
   list.add("Element");

   // print the size of the list
   System.out.println("List size:" + list.size());
   }
}