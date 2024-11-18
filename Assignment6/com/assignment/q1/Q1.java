package com.assignment.q1;

import java.util.Arrays;

public class Q1 {

	private static int SIZE;
	
public Q1() {
	// TODO Auto-generated constructor stub
SIZE=0;
}

public static void createMinHeap(int []arr)
{
	for(int i=1;i<arr.length;i++)
	{
		SIZE++;
		int ci=SIZE;
		int pi=ci/2;
		
		while(pi>=1)
		{
				if(arr[pi]<arr[ci])
				{
					break;
				}
				int temp=arr[pi];
				arr[pi]=arr[ci];
				arr[ci]=temp;
				
				ci=pi;
				pi=ci/2;
		}
		
	}
}



public static void deleteMinHeap(int [] arr)
{
	
for(int i=1;i<arr.length;i++)
{
	int min=arr[1];
		arr[1]=arr[SIZE];
		arr[SIZE]=min;
		SIZE--;
		int pi=1;
		int ci=2*pi;
		
		while(ci<=SIZE)
		{
			if((ci+1)<=SIZE && arr[ci+1]<arr[ci])
			{
				ci=ci+1;
			}
			
			if(arr[pi]<arr[ci])
				break;
			
			int temp=arr[pi];
			arr[pi]=arr[ci];
			arr[ci]=temp;
			
			pi=ci;
			ci=2*pi;
		}
}
	
}

	
	
	public static void heapSort(int [] arr)
	{
		createMinHeap(arr);
		deleteMinHeap(arr); 
	}
	
	
public static void main(String[] args) {
		
		int []arr= {0,400,12,7,34,22,543};
		heapSort(arr);
		System.out.println(Arrays.toString(arr));
		
	
	}
	
}
	
	





	
