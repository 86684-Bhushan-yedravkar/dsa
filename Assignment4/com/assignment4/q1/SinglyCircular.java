package com.assignment4.q1;

public class SinglyCircular {
	public static void main(String[] args) {
		
		LinkedList l1=new LinkedList();
		l1.addFirst(50);
		l1.addFirst(40);
		l1.addFirst(30);
		l1.addFirst(20);
		l1.addFirst(10);
		l1.addLast(60);
		l1.createAtPosition(3, 70);
		
		l1.displayList();
		
//		l1.deleteLast();
		l1.deleteAtPosition(7);
		System.out.println();
		l1.displayList();
	}

}
