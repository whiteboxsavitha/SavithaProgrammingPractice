package com.test;

import java.io.File;

import org.testng.annotations.Test;

import com.filehandling.WordReplace;

import static org.testng.AssertJUnit.assertEquals;

public class WordReplaceTest {
  @Test(groups = "positive") 
   public void wordReplacepos() {
		  File file;
	  file = new File("resource/source");
  		boolean trf = WordReplace.WordReplaceinFile(file, "Java", "JAVA8");
  		assertEquals(trf, true);
  	  }
  @Test(groups = "negative") 
  public void wordReplaceneg() {
		  File file;
	  file = new File("resource/source");
 		boolean trf = WordReplace.WordReplaceinFile(file, "Java", "JAVA8");
 		assertEquals(trf, false);
 	  }

}
