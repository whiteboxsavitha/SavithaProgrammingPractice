package com.test;

import org.testng.annotations.Test;

import com.oops.Inheritance;
import com.oops.Inheritance.MethodOverriding;

import static org.testng.AssertJUnit.assertEquals;

public class InheritanceTest {
  @Test(groups = "positive")
  public void Methodoverloadingpos() {
	  int sum= Inheritance.addnumbers(6,7);
	  
	  assertEquals(sum,13);
  }
  @Test(groups = "negative")
  public void Methodoverloadingneg() {
	  int sum= Inheritance.addnumbers(6,7);
	  
	  assertEquals(sum,12);
  }
  @Test(groups = "positive")
  public void Methodoverridingpos() {
	  MethodOverriding firstobject= new MethodOverriding();
	  MethodOverriding secondobject= new MethodOverriding();
	  int first = firstobject.multiplynumbers(5, 7);	  
	  int second = secondobject.multiplynumbers(6, 2);
	  
	  
	  assertEquals(first,second);
  }
  @Test(groups = "negative")
  public void Methodoverridingneg() {
	  MethodOverriding firstobject= new MethodOverriding();
	  MethodOverriding secondobject= new MethodOverriding();
	  int first = firstobject.multiplynumbers(5, 7);	  
	  int second = secondobject.multiplynumbers(6, 2);
	  assertEquals(first,35);
  }
}
