package com.sunbeam;



public class Linearqueu {

	
	

		private int arr[];
		private int size;
		private int front,rear;
		
		public Linearqueu(int size) {
		arr=new int[size];
		this.size=size;
		front=rear=0;
		}
		
		
		public void push(int value)
		{
			
			arr[rear]=value;
			rear++;
		}
		
		public int pop() {
			
			int temp=arr[front ];
			
			
			return arr[front++];
		}
		
		public int peek()
		{
			
			return arr[front];
		}
		
		public boolean isEmpty()
		{
			if(front==rear)
			{
				return true;
			}
			return false;
		}

		public boolean isFull()
		{
			if(rear==size)
			{
				return true;
			}
			return false;
		}
		
}
