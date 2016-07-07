package com.test;
import com.strings.*;

import org.testng.annotations.Test;


import static org.testng.AssertJUnit.assertEquals;

public class PalindromeTest {
  @Test(groups="Positive")
  public void findPalindrome() {
	  
	 String original = "savithaahtivas";
	 boolean Actual = Palindrome.isPalindrome(original);
	  assertEquals(Actual, true);
	  
  }

  @Test(groups="Negative")
  public void findPalindromeneg() {
	  
	 String original = "savitha";
	 boolean Actual = Palindrome.isPalindrome(original);
	  assertEquals(Actual, true);
	  
  }


}
