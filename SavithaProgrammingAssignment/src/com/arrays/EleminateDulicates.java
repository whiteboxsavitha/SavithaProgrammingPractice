package com.arrays;

public class EleminateDulicates 
{
	public static int[] removeDuplicates(int[] input){
        
        int j = 0;
        int i = 1;
        //return if the array length is less than 2
        if(input.length < 2){
            return input;
        }
        while(i < input.length){
            if(input[i] == input[j]){
                i++;
            }else{
                input[++j] = input[i++];
            }   
        }
        int[] output = new int[j+1];
        for(int k=0; k<output.length; k++){
            output[k] = input[k];
        }
         
        return output;
    }
	public static void main(String[] args) 
	{
		//EleminateDulicates em = new EleminateDulicates();
	
		int [] input= { 12, 9, 4, 99, 120, 1, 3, 6, 9, 4, 99, 10};
		int[] output = EleminateDulicates.removeDuplicates(input);
		for(int i: output)
		System.out.println(i+ " ");
	}
}
