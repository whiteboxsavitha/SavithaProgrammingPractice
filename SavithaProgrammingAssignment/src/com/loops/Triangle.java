package com.loops;

public class Triangle {

	public static void drawPyramidPattern() {
	  	int count =1;
	     
		for (int i = 0; i < 5; i++) {
      /*       for (int j = 0; j < 5 - i; j++) {  /// pyramid
                System.out.print(" ");
            }
     */       for (int k = 0; k <= i; k++) {
         
    	 	System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }

	  public static void main(String args[])
	    {
		  Triangle.drawPyramidPattern();
	    }

}
