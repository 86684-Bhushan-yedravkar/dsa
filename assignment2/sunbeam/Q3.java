package com.sunbeam;


import java.util.Scanner;

public class Q3 {
	
	
	

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Size Of Array:");
			int size=sc.nextInt();
			
			Linearqueu l1=new Linearqueu(size);
			
			int ch=0;
			do {
				
				System.out.println("0.Exit\n1.Push Element\n2.Pop Element\n3.Peek Element\nEnter Choice:");
				ch=sc.nextInt();
				
				switch (ch) {
				case 1:
					if(l1.isFull())
					{
						System.out.println("Queue Is Full");
					}
					
					else
					{
						int value=sc.nextInt();
						l1.push(value);
						System.out.println("Element "+value+" added in queue :)");
					}
					break;
				case 2:
					if(l1.isEmpty())
					{
						System.out.println("Queue is Empty :)");
					}
					else
					{
						int poppedEle=l1.pop();
						System.out.println("Popped Element in Queue is "+poppedEle);
					}
					break;

				case 3:
					if(l1.isEmpty())
					{
						System.out.println("Queue is Empty :)");
					}
					else
					{
						System.out.println("Peek Element is "+l1.peek());
					}
					break;
					
				
				default:
					break;
				}
				
				
			} while (ch!=0);
			
			
			
			
		}

	


}

