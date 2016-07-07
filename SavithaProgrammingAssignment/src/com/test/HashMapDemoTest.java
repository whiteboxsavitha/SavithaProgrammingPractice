package com.test;

import java.util.HashMap;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

import com.collection.HashMapDemo;

public class HashMapDemoTest {

	/*HashMap<Integer, String> set;
	@BeforeMethod
		public static void beforetest()
	{
	
	}
	*/
	
	@Test(groups = "Positive")
	
	  
	  
  public void HashmapgetvaluefromKey() {
		  
		HashMap<Integer,String> set = new HashMap<Integer,String>();
		set.put(1,"savitha");
		set.put(2,"nishitha");
		set.put(8,"sucheth");
		set.put(6,"smitha");
		set.put(3,"latha");
		set.put(4,"ranjitha");
		set.put(7,"rashmintha");
		set.put(5,"rakshitha");		
		int k =6;
		String Actual = HashMapDemo.HashMapkey(set, k);
		assertEquals(Actual, "smitha");
		}
	  
  @Test(groups = "Negative")
public void Hashmapgetvaluefromkeneg()
  {
	  HashMap<Integer,String> set = new HashMap<Integer,String>();
		set.put(1,"savitha");
		set.put(2,"nishitha");
		int k =2;
		String Actual = HashMapDemo.HashMapkey(set, k);
		assertEquals(Actual, "smitha");
				
  }
	
	
	
}
