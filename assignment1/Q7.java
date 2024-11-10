package com.sunbeam;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int integers[]= {10, 20, 15, 3, 4, 4, 1};
		
		System.out.println("enter the key");
	  int key=sc.nextInt();
	  int rank=0;
	  for (int i = 0; i < integers.length; i++) {
		 if(integers[i]<=key) {
			 rank++;
		 }
	  }
	  System.out.println("rank will be="+rank);
	  
	}

}
