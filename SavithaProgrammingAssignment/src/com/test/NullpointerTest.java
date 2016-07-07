package com.test;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

import com.exceptionhandling.NullpointerandArithmeticexample;

public class NullpointerTest {
  @Test(expectedExceptions = ArithmeticException.class)
  public void Nullpointerpos() {

		String actual= NullpointerandArithmeticexample.nullpointertry("sar", null);
		NullpointerandArithmeticexample.arrayoutofbound();
				
 // assertEquals(actual, "sar");
  
  }
  
  
  @Test(groups = "Positive")
  
  public void ArrayIndexOutofBound()
  {
	  NullpointerandArithmeticexample.arithmetictry();
  }
}
