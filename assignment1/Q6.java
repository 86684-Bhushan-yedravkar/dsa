package com.sunbeam;

public class Q6 {

	public static int noRepeat(int[]arr) {
	
	 int j=0;
	 for (int i = 0; i < arr.length; i++) {
		for ( j = 0; j < arr.length; j++) {
			if(arr[i]==arr[j]&&i!=j)
				break;
		}
	    if(j==arr.length)
	 return arr[i];
	 }
	return -1;
	 
	 
	
		
	}
	
	
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		System.out.println("First non-repeating element: " + noRepeat(arr));
	}
}
