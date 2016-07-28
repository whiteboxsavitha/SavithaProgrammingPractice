
 package com.collection;

 /*2.Insert the following in a dictionary. 

take -> carry or bring with one
jump -> move suddenly and quickly in a specified way
walk -> an act of traveling or an excursion on foot
run -> an act or spell of running
dance -> move in a quick and lively way
help -> serve someone with
run -> an act or spell of running
 
 
 */




import java.util.Hashtable;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
public class ColSecond {
	public static Hashtable d = new Hashtable(); 
    
   public char addNewWords(String k, String v){
	//   char c;
		//	         
	//	   Hashtable d = new Hashtable(); 
	       d.put("take","carry or bring with one");
	       d.put("jump","jump jump jump");
	       d.put("walk","an act of traveling or an excursion on foot");
	       d.put("pump","move suddenly and quickly in a specified way");
	       d.put("run","an act or spell of running");
	       d.put("dance","move in a quick and lively way");
	       d.put("help", "serve someone with");
	 	   // d.containsKey(key)
	 	    //d.contains(value)
	       if(d.containsKey(k))
	       {
	    	   d.put(k,v);
	    	 return 'u';
	    	 //  System.out.println(k + " : Updating");
	       }
	       else
	       {
	    	   d.put(k,v);
	    	   return 'a';
	 //   break;
	   // 	   System.out.println(k + ": Adding");
	       }
	       
	     // Enumeration kk= d.keys();
	      //Enumeration vv= d.elements();
		  
	     // while(kk.hasMoreElements()&& vv.hasMoreElements())
	      //{
	//      System.out.print(kk.nextElement()+ ":");
	  //  	  System.out.println(vv.nextElement());
	    //  }
	    //  System.out.println(s);
	  //    return s;
	  //    return 'n';
   }
	public static void main(String[] args) {
		   
		ColSecond cs= new ColSecond();
	
		//Check if the new word is been added
		
		char checkupdateresult= cs.addNewWords("jump","jump jump");
		System.out.println(checkupdateresult);
		    if(checkupdateresult == 'u')
			 System.out.println("Updated sucessfully");
		   System.out.println(d.containsValue("jump jump"));

			//Check if the existing word is been updated
		
			char checkaddresult= cs.addNewWords("tree","machured plant");
			System.out.println(checkaddresult);
			
			    if(checkaddresult == 'a')
					 System.out.println("Added sucessfully");
				  System.out.println(d.containsKey("tree"));
	}	
	}