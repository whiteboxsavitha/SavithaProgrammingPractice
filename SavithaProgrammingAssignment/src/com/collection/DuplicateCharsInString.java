package com.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//

public class DuplicateCharsInString {
	  public void findDuplicateChars(String str){
	         
	        Map<Character, Integer> dupMap = new HashMap<Character, Integer>();
	        char[] chrs = str.toCharArray();
	        for(Character ch:chrs){
	            if(dupMap.containsKey(ch)){
	                dupMap.put(ch, dupMap.get(ch)+1);
	            } else {
	                dupMap.put(ch, 1);
	            }
	        }
	        ///Get 
	        Entry<Character, Integer> maxEntry = null;

	        for(Entry<Character,Integer> entry : dupMap.entrySet()) {
	            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
	                maxEntry = entry;
	            }
	        }
	        
	        
	     //   System.out.println(maxEntry);
	        // to get the value we can use collection.max and pass the values ..
	       System.out.println(Collections.max(dupMap.values()));
	        
	        /*Set<Character> keys = dupMap.keySet();
		        for(Character ch:keys){
		            if(dupMap.get(ch) > 1){
		           // 	dupMap.containsValue(value)
		            
		            	System.out.println(ch+"--->"+dupMap.get(ch));
		            }
		        } */
		    }
	  
	  public void findDuplicateWords(String str){
	  
		  String[] dup = str.split(" ");
		  Map<String, Integer> mp = new HashMap<String, Integer>();
		  for(String s: dup)
		  {

	            if(mp.containsKey(s)){
	                mp.put(s, mp.get(s)+1);
	            } else {
	                mp.put(s, 1);
	            }
		  }
	      Set<String> keys = mp.keySet();
	        for(String ch:keys){
	            if(mp.get(ch) > 1){
	                System.out.println(ch+"--->"+mp.get(ch));
	            }
	        }
	  
	  }
	     
	    public static void main(String a[]){
	        DuplicateCharsInString dcs = new DuplicateCharsInString();
	   //     dcs.findDuplicateChars(" asdfdf asdf tyrwt sfgsdfy sfgdb");
	        dcs.findDuplicateChars("sssssssgfsg reyoiuerypoyilk lekthlketkhj");
	        
	    }}
