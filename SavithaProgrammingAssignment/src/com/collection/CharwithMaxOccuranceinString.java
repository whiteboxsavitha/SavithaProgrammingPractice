package com.collection;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class CharwithMaxOccuranceinString {
	  public char findDuplicateChars(String str){
	         
	        Map<Character, Integer> dupMap = new HashMap<Character, Integer>();
	        char[] chrs = str.toCharArray();
	        for(Character ch:chrs){
	            if(dupMap.containsKey(ch)){
	                dupMap.put(ch, dupMap.get(ch)+1);
	            } else {
	                dupMap.put(ch, 1);
	            }
	        }
	        ///Get the Char with Max occurence in String
	        Entry<Character, Integer> maxEntry = null;

	        for(Entry<Character,Integer> entry : dupMap.entrySet()) {
	            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
	             //  	System.out.println(maxEntry.getKey());
	       	     
	            	maxEntry = entry;
	            }
	        }
	        char maxoc= maxEntry.getKey();
	        return maxoc;
	     //System.out.println(maxEntry);
	        //===== to get the value we can use collection.max and pass the values ..
	     //  System.out.println(Collections.max(dupMap.values()));
		    }
	  	     
	    public static void main(String a[]){
	        CharwithMaxOccuranceinString dcs = new CharwithMaxOccuranceinString();
	       char maxoc =  dcs.findDuplicateChars("savithaaaaaa");
	       System.out.println(maxoc);
	    }}
