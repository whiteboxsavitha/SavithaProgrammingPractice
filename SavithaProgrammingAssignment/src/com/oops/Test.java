package com.oops;


public class Test extends VirtualMethodInovation{
       public int number = 2;
       public String getColor(){
       return "blue";
       }
       public static void main(String[] args){
       	VirtualMethodInovation supersub = new Test();
       	Test supersub1 = new Test();//You can do this thanks polymorphism
           System.out.println( supersub.getColor() + supersub.number );
           System.out.println( supersub.getColor() + supersub1.number);
           }
}

