package com.arrays;

public class Mergearrays {

	
	public int[] merge(int[] a, int[] b){
		int[] result = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while(j < a.length && k <b.length)  result[i++] = a[j] < b[k] ? a[j++] : b[k++];
		if(j < a.length) System.arraycopy(a, j, result, i, a.length - j);
		else if(k <b.length) System.arraycopy(b, k, result, i, b.length - k);

		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[] first = {5,6,6,7,8,6};
	int[] second = {5,3,7,3,2,98,25};
	
	Mergearrays mr = new Mergearrays();
	int[] results = mr.merge(first, second);
for(int p=0; p<results.length; p++)
{
	
	System.out.println(results[p]);
}
	}

}
