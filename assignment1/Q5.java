package com.sunbeam;

import java.util.Scanner;

import java.util.Arrays; 
public class Q5 {
	
public static int findkey(int arr[],int key,int occ) {
int occs=0;	
	for (int i = 0; i < arr.length; i++) {
		
		if(key==arr[i]) {
		  occs++;
		  if(occs==occ)
			  return i;
		  }
	}
	
	return -1;
}
	
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the key");
		
		System.out.println("enter the occuranc");
		int key = sc.nextInt();
		int occ = sc.nextInt();
		int arr[]= {12,10,13,46,54,10,34,24,10};
		
		
int index=findkey(arr,key,occ);
			
if (index == -1)
System.out.println("occurance not found ...!");
else
System.out.println("occurance will be at idex = " +index );
			
			
		

	}

}

