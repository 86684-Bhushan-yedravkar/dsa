package com.assignment.q2;

import java.util.Arrays;

public class Q2 {

	
		private int arr [];
		private int SIZE;
		
	public Q2(int size) {
		// TODO Auto-generated constructor stub
	
		arr =new int [size+1];
		SIZE=0;
	
	}
	
	public   void addElementHeap(int val)
	{
		if(isFull())
		{
			System.out.println("Heap is Full :)");
		}
		else
		{
			
			
				
				SIZE++;
				arr[SIZE]=val;
				System.out.println("Element Added Successfully");

				int ci=SIZE;
				
				int pi=ci/2;
				
				while(pi>=1)
				{
					if(arr[pi]>arr[ci])
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
	
	
	
	
	public void popHeap()
	{
		if(isEmpty())
		{
			System.out.println("Heap Empty :(");
			
		}
		else
		{
						
						int max=arr[1];
						 arr[1]=arr[SIZE];
						
						 arr[SIZE]=max;
						 SIZE--;
							System.out.println("Element Deleted Successfully");

						 
						 int pi=1;
						int  ci=pi*2;
						 while(ci<=SIZE)
						 {
							if(arr[ci+1]>arr[ci] && ci+1<=SIZE )
							{
								ci=ci+1;
							}
							
							if(arr[ci] < arr[pi])
								break;
							int temp=arr[pi];
							arr[pi]=arr[ci];
							arr[ci]=temp;
							
							pi=ci;
							ci=2*pi;
							
						 }
					}
	
			
	}
	public boolean isFull()
	{
		return SIZE==arr.length-1;
	}
	
	public boolean isEmpty()
	{
		return SIZE==0;
	}
	
	public void displayHeapList()
	{
		System.out.println(Arrays.toString(arr));
	}
	
	public void displayPeekElemet()
	{
		System.out.println("Peek Element:"+arr[1]);
	}
	
	

}
