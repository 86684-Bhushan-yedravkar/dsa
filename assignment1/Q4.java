package com.sunbeam;


import java.util.Scanner;

public class Q4 {
//	 public static int comp=0;

	private static int binarysearch(int[]arr, int key) {
		int left=0,right=arr.length-1,mid;
		while (left<=right) {
			mid=left+right/2;
			
			if(key==arr[mid]) { 
				
			return mid;
			}			
			else if(arr[mid]>key){
				
				left=mid+1;
			}
			else {
				right=mid-1;
				
			}
		}
		
		
		return -1;
	}
	
	
	
	public static void main(String[] args) {
	    
       Scanner sc=new Scanner(System.in);
        int []arr= {90,80,70,60,50,40,30,20,10};
		System.out.println("enter the key");
        int key=sc.nextInt();
        
        int index=binarysearch(arr,key);
		if(index==-1){
			
			System.out.println("key is not found");
		}
		else {
			
			

			System.out.println("key willbe="+index);
//             System.out.println("copmparision will be="+comp);
		}
	}

	
}
