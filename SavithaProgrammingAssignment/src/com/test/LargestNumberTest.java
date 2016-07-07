package com.test;

import org.testng.annotations.Test;

import com.arrays.LargestNumber;

import static org.testng.AssertJUnit.assertEquals;

public class LargestNumberTest {
  @Test(groups = "Positive")
  public void findLargestNumber() {

	  int arry[] = { 32, 43, 52, 67, 12, 5, 7, 53, 54, 32, 65, 63, 98, 43, 23 };    
	    	
  int Actual = LargestNumber.findLargestNumber(arry);
  
  assertEquals(Actual, 98);
  }

  @Test(groups = "Negative")
  public void findLargestNumberneg() {

	  int arry[] = { 32, 43, 52, 67, 12, 5, 7, 53, 54, 32, 65, 63, 98, 43, 23 };    
	    	
  int Actual = LargestNumber.findLargestNumber(arry);
  
  assertEquals(Actual, 63);
  }


}
