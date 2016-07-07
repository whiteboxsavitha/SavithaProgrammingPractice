package com.loops;


import java.io.Console;
import java.util.Scanner;

/**
 * Created by Savi on 5/23/2016.
 */
public class PrintNETZSXPL {
    public static void main(String[] args)
    {
        RunTheShow();

        return;
    }
    public static void RunTheShow()
    {
        while (true)
        {

            System.out.println("Enter the Matrix Size: ");
            Scanner input = new Scanner(System.in);
            int Dimension = input.nextInt();
            System.out.print("Enter the Matrix Style (N or Z): ");
            Scanner size = new Scanner(System.in);
            String  Style = size.next();
            BuildMatrix(Dimension, Style.toUpperCase());


            System.out.print("Hit X to EXIT!");
            Scanner exit = new Scanner(System.in);
            String exit1 = exit.next();
            if (exit1.toUpperCase().equals("o"))
                break;
            System.out.println();
            System.out.println();
        }

    }
    public static void BuildMatrix(int size, String style)
    {
        int Dimension = size;
        int value = 1;
        for (int i = 0; i < Dimension; i++)
        {
            StringBuilder Pattern = new StringBuilder();

            if (style.equals("N"))
            {
                for (int j = 0; j < Dimension; j++)
                {
                    if (value > 9)
                        value = 0;

                    if (j == 0 || j == Dimension - 1 || j == i)
                    {
                          Pattern.append( Integer.toString(value));
                        value++;
                    }
                    else
                        Pattern.append(" ");
                }
            }
            if (style.equals("Z"))
            {
                for (int j = 0; j < Dimension; j++)
                {
                    if (value > 9)
                        value = 0;

                    if (i == 0 || i == Dimension - 1 || j == Dimension - (i + 1))
                    {
                        Pattern.append( Integer.toString(value));
                        value++;
                    }
                    else
                        Pattern.append(" ");
                }
            }
            if (style.equals("E")) {
                for (int j = 0; j < Dimension; j++) {
                    if (value > 9)
                        value = 0;

                    if (j == 0 || i == 0 || i == (Dimension / 2) || i == Dimension - 1) {
                        Pattern.append(Integer.toString(value));
                        value++;
                    } else
                        Pattern.append(" ");
                }
            }
             if (style.equals("T"))
                {
                    for (int j = 0; j < Dimension; j++)
                    {
                        if (value > 9)
                            value = 0;

                        if (i == 0 || j == (Dimension /2))
                        {
                            Pattern.append( Integer.toString(value));
                            value++;
                        }
                        else
                            Pattern.append(" ");
                    }
    }
            if (style.equals("L"))
            {
                for (int j = 0; j < Dimension; j++)
                {
                    if (value > 9)
                        value = 0;

                    if (j == 0 || i == (Dimension -1))
                    {
                        Pattern.append( Integer.toString(value));
                        value++;
                    }
                    else
                        Pattern.append(" ");
                }
            }
            if (style.equals("X")) {
                for (int j = 0; j < Dimension; j++) {
                    if (value > 9)
                        value = 0;

                    if ((i == j) || j == (Dimension - (i+1)))
                    {
                        Pattern.append(Integer.toString(value++));
                    } else
                        Pattern.append(" ");
                }
            }
           if (style.equals("S"))
            {
                for (int j = 0; j < Dimension; j++) {
                    if (value > 9)
                        value = 0;

                    if (i == 0 || i == (Dimension - 1) || i == Dimension / 2 || (i < (Dimension / 2) && j == 0) || (i > (Dimension / 2) && j == (Dimension - 1)))
                    {
                        Pattern.append(Integer.toString(value++));
                        value++;
                    }

                    else
                        Pattern.append(" ");
        }
          if(style.equals("Pyramid"))
          {
        	  int value1=0;
        	        for (int j = 0; j < 5; j++) {
        	            for (int k = 0; k < 5 - j; k++) {
        	                System.out.print(" ");
        	            }
        	            for (int w = 0; w <= j; w++) {
        	                Pattern.append(Integer.toString(value++));
        	                 
        	            }
        	            System.out.println();
        	        }



          }
          }
                
            

           System.out.println(Pattern);
        }
    }
}




