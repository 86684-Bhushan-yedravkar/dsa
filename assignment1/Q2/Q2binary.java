

import java.util.Scanner;

public class Q2binary {
	 public static int comp=0;

	private static int binarysearch(int[]arr, int key) {
		int left=0,right=arr.length-1,mid;
		while (left<=right) {
			mid=left+right/2;
			comp++;
			if(key==arr[mid]) { 
				
			return mid;
			}			
			else if(arr[mid]>key){
				
				right=mid-1;
			}
			else {
				left=mid+1;
				
			}
		}
		
		
		return -1;
	}
	
	
	
	public static void main(String[] args) {
	    
       Scanner sc=new Scanner(System.in);
        int []arr= {10,20,30,40,50,60,70,80,90};
		System.out.println("enter the key");
        int key=sc.nextInt();
        
        int index=binarysearch(arr,key);
		if(index==-1){
			
			System.out.println("key is not found");
		}
		else {
			
			

			System.out.println("key willbe="+index);
             System.out.println("copmparision will be="+comp);
		}
	}

	
}
