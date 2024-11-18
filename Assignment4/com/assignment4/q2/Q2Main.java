package com.assignment4.q2;

import java.util.Scanner;

public class Q2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Q2Stack q=new Q2Stack();
		Q2Queue q1=new Q2Queue();
		
		int ch=0;
		do {
			
			System.out.println("\n\n1.Push Element in Stack.\n2.Pop Element in Stack.\n3.Peek Element of Stack.\n4.Traverse Stack\n5.Push Element in Queue.\n6.Pop Element in queue.\n7.Peek Element Of Peek.\n8.Traverse Queue\nEnter choice:");
			ch=sc.nextInt();
			
			switch (ch) {
			case 1:
				System.out.println("Enter Element to  push in Stack:");				
				int val=sc.nextInt();
				q.pushStack(val);
				break;
			case 2:
				int res=q.popStack();
				if(res==-1)
					System.out.println("Stack Empty");
				else
				System.out.println("Popped element: "+res);
	
				break;
			case 3:
				System.out.println("Peek Element: "+q.peekStack());
				break;
			case 4:
				q.displayStack();
				break;
			case 5:
				System.out.println("Enter Element to  push in Queue:");				
				 val=sc.nextInt();
				q1.pushQueue(val);
				break;
			case 6:
				 res=q1.popQueue();
				if(res==-1)
					System.out.println("Stack Empty");
				else
				System.out.println("Popped element: "+res);
	
				break;
			case 7:
				System.out.println("Peek Element: "+q1.peekQueue());
				break;
			case 8:
				q1.displayQueue();
				break;
		
			default:
				break;
			}
			
		} while (ch!=0);
		
		
//		q.deletelast();
//		q.deletelast();
//		q.deletelast();
//		q.deletelast();
//		q.deletelast();
//		int res =q.deletelast();
//		
//		System.out.println(res);
//		
//		
//		
//		q.displayStack();
	}

}
