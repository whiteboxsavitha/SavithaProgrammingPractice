package com.collection;


	import java.util.*;
	 
	public class DuplicatesinArrayList{
	 
	        ArrayList<String> animals = new ArrayList<String>();
	        int count;
	 
	        public DuplicatesinArrayList(){
	            animals.add("zebra");
	            animals.add("dog");
	            animals.add("horse");
	            animals.add("zebra");
	            animals.add("dog");
		         
	            for(int x = 0; x < animals.size(); x++){
	                if(isFirstInstance(animals.get(x), x)){
	                    for(int y = x+1; y < animals.size(); y++){
	                        if(animals.get(y).equals(animals.get(x))) count++;
	                    }
	                }
	            }
	            System.out.println(count);
	        }
	 
	        public boolean isFirstInstance(String animal, int pos){
	            if(pos == 0)return true;
	            for(int y = 0; y < pos; y++){
	                if(animals.get(y).length()==animal.length()) return false;
	            }
	            return true;
	        }
	 
	    public static void main(String[] args){
	        DuplicatesinArrayList test = new DuplicatesinArrayList();
	    }
	}