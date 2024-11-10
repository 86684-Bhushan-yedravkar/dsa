import java.util.Scanner;

import java.util.Arrays; 
public class Q1 {
	
public static int findkey(int arr[],int key) {
int last=0;	
	for (int i = 0; i < arr.length; i++) {
		
		if(key==arr[i]);
		 last=i;
	}
	return last;
	
}
	
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the key");
		
		int key = sc.nextInt();
		int arr[]= {12,10,13,46,54,10,34,24,10};
		
		
int index=findkey(arr,key);
			
if (index == -1)
System.out.println("index not found...!");
else
System.out.println("index at : " + index);

			
			
		

	}

}
