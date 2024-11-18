package com.assignment.q2;

import java.util.Scanner;

public class Q2Test {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		
		System.out.println("Enter size of Heap:");
		int size=sc.nextInt();
		Q2 q=new Q2(size);
		
		
		
		int ch=0;
		do {
			
			System.out.println("1.Add Element In priority queue");
			System.out.println("2.Pop Element In priority queue");
			System.out.println("3.Peek Element In priority queue");
			System.out.println("4.Display priority queue");
			System.out.println("Enter Choice");
			ch=sc.nextInt();
			
			switch (ch) {
			case 1:
				System.out.println("Enter Value:");
				int val=sc.nextInt();
				q.addElementHeap(val);
				
				break;
			case 2:
				q.popHeap();
				break;
				
			case 3 :
				q.displayPeekElemet();
				break;
				
			case 4:
				q.displayHeapList();
				break;
				

			default:
				break;
			}

			
		} while (ch!=0);
	}
	

	}
